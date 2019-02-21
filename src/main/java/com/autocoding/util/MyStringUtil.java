package com.autocoding.util;

import java.io.File;

public final class MyStringUtil
{

    private MyStringUtil ()
    {

    }

    public static class GetSeperatedPathFromPackageParameter
    {
        private String rootPackage;

        public GetSeperatedPathFromPackageParameter (String rootPackage)
        {
            this.rootPackage = rootPackage;
        }

        public String getRootPackage ()
        {
            return rootPackage;
        }

        public void setRootPackage (String rootPackage)
        {
            this.rootPackage = rootPackage;
        }
    }

    /**
     * @deprecated Use
     *             {@link #getSeperatedPathFromPackage(GetSeperatedPathFromPackageParameter)}
     *             instead
     */
    public static String getSeperatedPathFromPackage (String rootPackage)
    {
        return getSeperatedPathFromPackage (new GetSeperatedPathFromPackageParameter (rootPackage));
    }

    /**
     * 
     * @function 这里使用introduce parameter object重构手法完成重构，仅在于练习，使用alt+shift+T ，eclispe 自动完成重构
     * @date 2019年2月21日 上午11:22:00
     * @author 李桥
     * @version 1.0
     */
    public static String getSeperatedPathFromPackage (GetSeperatedPathFromPackageParameter parameterObject)
    {

        String path = parameterObject.getRootPackage ().replaceAll ("\\.", "\\" + File.separator);

        if (!path.endsWith (File.separator))
        {
            path += File.separator;
        }

        return path;
    }

}
