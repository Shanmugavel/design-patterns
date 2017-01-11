/**
 * 
 */
package xyz.shanmugavel.creational.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Shanmugavel
 *
 */
public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThirdPartySevice svc =  ServiceProviderFactory.getProvider(Providers.ProviderA);
		LOGGER.info("ServiceName={}", svc.getClass());
		svc =  ServiceProviderFactory.getProvider(Providers.ProviderB);
		LOGGER.info("ServiceName={}", svc.getClass());
	}

}
