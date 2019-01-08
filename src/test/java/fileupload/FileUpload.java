package fileupload;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 文件上传对象
 * 
 * @date 2018年2月26日 下午2:20:38
 * @author Li Qiao
 * @version 1.0
 */

public class FileUpload extends AbsFileUpload {
	private static Logger s_logger = LoggerFactory.getLogger(FileUpload.class);
	private List<IFileUploadHandler> handlerList = new ArrayList<IFileUploadHandler>();

	private FileUpload(File f, String fileName) {
		super.file = f;
		super.originalFileName = fileName;
	}

	@Override
	public void addHandler(IFileUploadHandler handler) {
		this.handlerList.add(handler);
	}

	@Override
	public void removeHandler(IFileUploadHandler handler) {
		this.handlerList.remove(handler);
	}

	@Override
	public void uploadFile() {
		if (this.handlerList.size() == 0) {
			return;
		}

		for (IFileUploadHandler h : this.handlerList) {
			h.doUploadFile(this);
		}

	}

	public static class FileUploadFactory {
		public static AbsFileUpload create(File f, String fileName) {
			return new FileUpload(f, fileName);
		}
	}
}
