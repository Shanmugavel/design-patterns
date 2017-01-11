/**
 * 
 */
package xyz.shanmugavel.creational.abstractfactory;

/**
 * @author Shanmugavel_S01
 *
 */
public class FactoryProvider {

	public static StationeryFactory getFactory(FactoryNames factoryName) {
		StationeryFactory factory = null;
		if (FactoryNames.CAMEL == factoryName) {
			factory = new CamelFactory();
		} else if (FactoryNames.NATRAJ == factoryName) {
			factory = new NatrajFactory();
		}
		return factory;
	}
}
