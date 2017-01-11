/**
 * 
 */
package xyz.shanmugavel.creational.abstractfactory;

/**
 * @author Shanmugavel_S01
 *
 */
public class PlasticBag extends Bag {

	public PlasticBag() {
		super("Plastic");
	}

	@Override
	public String print() {
		return name;
	}

}
