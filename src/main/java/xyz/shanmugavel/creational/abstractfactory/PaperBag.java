/**
 * 
 */
package xyz.shanmugavel.creational.abstractfactory;

/**
 * @author Shanmugavel_S01
 *
 */
public class PaperBag extends Bag {

	public PaperBag() {
		super("Paper");
	}
	
	@Override
	public String print() {
		return name;
	}

}
