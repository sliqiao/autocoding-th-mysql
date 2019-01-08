package fileupload;

import java.io.File;

/**
 * 文件上传接口
 * 
 * @date 2018年2月26日 下午2:12:43
 * @author Li Qiao
 * @version 1.0
 */

public abstract class AbsFileUpload {
	public abstract void addHandler(IFileUploadHandler handler);

	public abstract void removeHandler(IFileUploadHandler handler);

	public abstract void uploadFile();

	protected File file;

	protected String originalFileName;
	protected String newlFileName;
	protected String newlFileTargetDir;

	/** getter: file */
	public File getFile() {
		return this.file;
	}

	/** getter: originalFileName */
	public String getOriginalFileName() {
		return this.originalFileName;
	}

	/** getter: newlFileName */
	public String getNewlFileName() {
		return this.newlFileName;
	}

	/** getter: newlFileTargetDir */
	public String getNewlFileTargetDir() {
		return this.newlFileTargetDir;
	}

	/** setter: file */
	public void setFile(File file) {
		this.file = file;
	}

	/** setter: originalFileName */
	public void setOriginalFileName(String originalFileName) {
		this.originalFileName = originalFileName;
	}

	/** setter: newlFileName */
	public void setNewlFileName(String newlFileName) {
		this.newlFileName = newlFileName;
	}

	/** setter: newlFileTargetDir */
	public void setNewlFileTargetDir(String newlFileTargetDir) {
		this.newlFileTargetDir = newlFileTargetDir;
	}

	/*
	 * 方法重写、覆盖
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AbsFileUpload [originalFileName=" + this.originalFileName + ", newlFileName=" + this.newlFileName
				+ ", newlFileTargetDir=" + this.newlFileTargetDir + "]";
	}

}
