package designpattern.strategy.subject2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 语言书
 * 
 * @date 2017年11月28日 下午1:41:40
 * @author 李桥
 * @version 1.0
 */

public class LanguageBook extends Book {
	/**
	 * @param absDiscountComputer
	 * @param realAmout
	 */
	public LanguageBook(AbsDiscountComputer absDiscountComputer, double realAmout) {
		super(absDiscountComputer, realAmout);
	}

	private static Logger s_logger = LoggerFactory.getLogger(LanguageBook.class);

}
