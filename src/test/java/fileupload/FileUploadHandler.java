package fileupload;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 请输入功能
 * 
 * @date 2018年2月26日 下午2:16:55
 * @author Li Qiao
 * @version 1.0
 */

public class FileUploadHandler implements IFileUploadHandler {
	private static Logger s_logger = LoggerFactory.getLogger(FileUploadHandler.class);

	@Override
	public void doUploadFile(AbsFileUpload iFileUpload) {

		if (null == iFileUpload) {
			return;
		}

	}
}
