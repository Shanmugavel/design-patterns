/**
 * 
 */
package xyz.shanmugavel.creational.factory;

/**
 * @author Shanmugavel
 *
 */
public class ProviderB implements ThirdPartySevice {

	@Override
	public boolean isStock(String prodName, String manufacturer) {
		return true;
	}

}
