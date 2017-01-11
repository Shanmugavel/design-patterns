/**
 * 
 */
package xyz.shanmugavel.creational.factory;

/**
 * @author Shanmugavel
 *
 */
public class ServiceProviderFactory {

	public static ThirdPartySevice getProvider(Providers provider) {
		ThirdPartySevice providerSvc = null;
		if (Providers.ProviderA == provider) {
			providerSvc = new ProviderA();
		} else if (Providers.ProviderB == provider) {
			providerSvc = new ProviderB();	
		}
		return providerSvc;
	}
}
