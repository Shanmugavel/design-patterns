/**
 * 
 */
package xyz.shanmugavel.creational.factory;

/**
 * @author Shanmugavel
 *
 */
public class ProviderA implements ThirdPartySevice {

	@Override
	public boolean isStock(String prodName, String manufacturer) {
		return false;
	}

}
