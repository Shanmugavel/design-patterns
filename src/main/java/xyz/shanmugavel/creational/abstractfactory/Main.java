/**
 * 
 */
package xyz.shanmugavel.creational.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Shanmugavel_S01
 *
 */
public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	StationeryFactory myFactory = FactoryProvider.getFactory(FactoryNames.CAMEL);
	LOGGER.info(" Factory={} Bag={} Pen={}", myFactory.getClass().getSimpleName(), myFactory.getBag().print(), myFactory.getPen().print());
	myFactory = FactoryProvider.getFactory(FactoryNames.NATRAJ);
	LOGGER.info(" Factory={} Bag={} Pen={}", myFactory.getClass().getSimpleName(), myFactory.getBag().print(), myFactory.getPen().print());
	}

}
