package fileupload;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fileupload.FileUpload.FileUploadFactory;

/**
 * 请输入功能
 * 
 * @date 2018年2月26日 下午2:20:04
 * @author Li Qiao
 * @version 1.0
 */

public class Test {
	private static Logger s_logger = LoggerFactory.getLogger(Test.class);

	public static void main(String[] args) {
		File f = new File("D:\\my.txt");
		AbsFileUpload fileUpload = FileUploadFactory.create(f, f.getName());
		fileUpload.addHandler(new IFileUploadHandler() {
			@Override
			public void doUploadFile(AbsFileUpload iFileUpload) {
				// TODO Auto-generated method stub
				iFileUpload.setNewlFileName("adfdafasfasfasdfasdfdas.txt");
				iFileUpload.setNewlFileTargetDir("my-new");
			}
		});
		fileUpload.uploadFile();
		System.err.println("fileUpload:" + fileUpload);
	}
}
