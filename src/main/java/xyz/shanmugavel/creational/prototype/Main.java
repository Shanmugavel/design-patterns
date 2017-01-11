/**
 * 
 */
package xyz.shanmugavel.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Shanmugavel_S01
 *
 */
public class Main {

	private static final Logger LOG = LoggerFactory.getLogger(Main.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Base firstObject = ObjectFactory.getObject(), secondObject = ObjectFactory.getObject(), thirdObject = ObjectFactory.getObject();
		LOG.info("FIRST {}", firstObject);
		LOG.info("SECOND {}", secondObject);
		LOG.info("THIRD {}", thirdObject);
	}

}
