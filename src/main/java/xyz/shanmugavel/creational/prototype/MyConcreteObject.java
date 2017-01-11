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
public class MyConcreteObject extends Base {

	private static final long serialVersionUID = 1L;

	private static final Logger LOG = LoggerFactory.getLogger(MyConcreteObject.class);

	public MyConcreteObject() {
		LOG.info("New Instance Created!");
	}
}
