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
public class ObjectFactory {

	private static final Logger LOG = LoggerFactory.getLogger(ObjectFactory.class);

	private static MyConcreteObject concrObj = new MyConcreteObject();
	
	public static Base getObject()  {
		Base baseObj = null;
		try {
			baseObj = concrObj.clone();
		} catch (CloneNotSupportedException e) {
			LOG.error("ERROR MSG={}", e.getMessage());
		}
		return baseObj;
	}
}
