package com.autocoding.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.autocoding.codebuilder.AbsCodeBuilder;
import com.autocoding.constant.ConfigConstant;
import com.autocoding.model.Entity;
import com.autocoding.model.Project;
import com.autocoding.util.CodeBuilderFactory;
import com.autocoding.util.CodeBuilderScanUtil;

public class AutoCodingMain
{

    private static final Logger LOGGER = LoggerFactory.getLogger (AutoCodingMain.class);
    private static final String default_encoding = "utf-8";
    private Connection conn;
    private Properties props;
    private String jdbcDriver;
    private String jdbcUrl;
    private String userName;
    private String password;
    private String rootPackage;
    private Project project;
    private String tablesName;

    public AutoCodingMain ()
    {
        try
        {
            String rootdir = System.getProperty ("user.dir");
            this.props = new Properties ();
            this.props.load (new InputStreamReader (new FileInputStream (rootdir + File.separator + "config.properties"), AutoCodingMain.default_encoding));
            this.jdbcDriver = this.props.getProperty (ConfigConstant.c3p0_driverClass);
            this.jdbcUrl = this.props.getProperty (ConfigConstant.c3p0_jdbcUrl);
            this.userName = this.props.getProperty (ConfigConstant.c3p0_user);
            this.password = this.props.getProperty (ConfigConstant.c3p0_password);
            this.rootPackage = this.props.getProperty (ConfigConstant.autocoding_package);
            this.tablesName = this.props.getProperty (ConfigConstant.autocoding_table_names);
            String prefix = this.props.getProperty (ConfigConstant.autocoding_prefix);
            this.project = new Project (rootdir, this.rootPackage, this.userName);
            this.project.setPrefix (prefix);
            this.project.setAuthor (this.props.getProperty (ConfigConstant.autocoding_author));
            String prefixWithSharp = prefix.replace (".", "/");
            this.project.setPrefixWithSharp (prefixWithSharp);
        }
        catch (Exception e)
        {
            AutoCodingMain.LOGGER.error ("执行AutoCodingMain.AutoCodingMain()异常:", e);
        }
    }

    private boolean connect ()
    {
        try
        {
            Class.forName (this.jdbcDriver);

            this.conn = DriverManager.getConnection (this.jdbcUrl, this.userName, this.password);

            AutoCodingMain.LOGGER.info ("---------数据库连接成功--------------");
            return true;
        }
        catch (Exception e)
        {
            AutoCodingMain.LOGGER.error ("执行AutoCodingMain.connect()异常:", e);
        }
        AutoCodingMain.LOGGER.info ("----------数据库连接失败--------------");

        return false;
    }

    private boolean disconnect ()
    {
        try
        {
            this.conn.close ();
            AutoCodingMain.LOGGER.info ("----------数据库断开成功--------------");
            return true;
        }
        catch (Exception e)
        {
            AutoCodingMain.LOGGER.error ("----------数据库断开失败--------------", e);
        }
        return false;
    }

    public void run ()
    {
        String[] names = this.tablesName.split (",");
        for (String name : names)
        {
            AutoCodingMain.LOGGER.info ("---------开始生成表[" + name + "]的代码--------------");
            this.run (name);
            AutoCodingMain.LOGGER.info ("---------完成生成表[" + name + "]的代码--------------");
        }
    }

    public void run (String tableName)
    {
        try
        {
            Entity entity = new Entity (this.conn, tableName);
            entity.parseEntityInfo ();
            this.project.setEntity (entity);

            AbsCodeBuilder codeBuilder = null;
            Set <Class < ? >> codeBuilderSet = CodeBuilderScanUtil.scan ();
            for (Class < ? > codeBuilderClass : codeBuilderSet)
            {
                codeBuilder = CodeBuilderFactory.createBuilder (codeBuilderClass, this.project);
                AutoCodingMain.LOGGER.info ("正在对【" + tableName + "】生成文件【" + codeBuilder.getFileoutputPath () + "】 ---【开始】");
                codeBuilder.saveToFile ();
                AutoCodingMain.LOGGER.info ("正在对【" + tableName + "】生成文件【" + codeBuilder.getFileoutputPath () + "】 ---【结束】");
            }
        }
        catch (Exception e)
        {
            AutoCodingMain.LOGGER.error ("执行AutoCodingMain.run()异常：", e);

        }
    }

    public static void main (String[] args)
    {
        AutoCodingMain autoCodingMain = new AutoCodingMain ();
        autoCodingMain.connect ();
        autoCodingMain.run ();
        autoCodingMain.disconnect ();
    }

}
