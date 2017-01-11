/**
 * 
 */
package xyz.shanmugavel.creational.abstractfactory;

/**
 * @author Shanmugavel_S01
 *
 */
public class InkPen extends Pen {

	public InkPen() {
		super("Ink");
	}


	@Override
	public String print() {
		return name;
	}

}
