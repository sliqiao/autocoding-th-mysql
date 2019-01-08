package designpattern.strategy.subject2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 请输入功能
 * 
 * @date 2017年11月28日 下午1:43:05
 * @author 李桥
 * @version 1.0
 */

public class ClientTest {
	private static Logger s_logger = LoggerFactory.getLogger(ClientTest.class);

	public static void main(String[] args) {
		Book computerBook = new ComputerBook(new TenOffDiscount(), 100);
		Book languageBook = new LanguageBook(new TwoLessDiscount(), 50);
		Book novelBook = new NovelBook(new TenLessDiscount(), 30);
		System.err.println("computerBook-price:" + computerBook.sellPrice());
		System.err.println("languageBook-price:" + languageBook.sellPrice());
		System.err.println("novelBook-price:" + novelBook.sellPrice());

	}
}
