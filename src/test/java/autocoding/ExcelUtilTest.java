package autocoding;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import net.sf.excelutils.ExcelUtils;

/**
 * @function
 * @date 2017年1月7日 下午5:26:44
 * @author 李桥
 * @version 1.0
 */

public class ExcelUtilTest {

	public static void main(String[] args) throws Exception {
		FileOutputStream out = new FileOutputStream(new File("E:\\excelText.xls"));
		String config = "E:\\excelTemplate.xls";
		Map<String, String> context = new HashMap<String, String>();
		context.put("name", "周涛");
		context.put("age", "男");
		ExcelUtils.export(config, context, out);
	}
}
