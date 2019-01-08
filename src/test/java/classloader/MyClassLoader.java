package classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class MyClassLoader extends ClassLoader {
	public MyClassLoader() {

	}

	public MyClassLoader(ClassLoader parent) {
		super(parent);
	}

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		File file = this.getClassFile(name);
		try {
			byte[] bytes = this.getClassBytes(file);
			Class<?> c = this.defineClass(name, bytes, 0, bytes.length);
			return c;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return super.findClass(name);
	}

	private File getClassFile(String name) {
		File file = new File("D:/Person.class");
		return file;
	}

	private byte[] getClassBytes(File file) throws Exception {
		// 这里要读入.class的字节，因此要使用字节流
		FileInputStream fis = new FileInputStream(file);
		FileChannel fc = fis.getChannel();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		WritableByteChannel wbc = Channels.newChannel(baos);
		ByteBuffer by = ByteBuffer.allocate(1024);

		while (true) {
			int i = fc.read(by);
			if (i == 0 || i == -1)
				break;
			by.flip();
			wbc.write(by);
			by.clear();
		}

		fis.close();

		return baos.toByteArray();
	}
}