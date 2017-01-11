/**
 * 
 */
package xyz.shanmugavel.creational.abstractfactory;

/**
 * @author Shanmugavel_S01
 *
 */
public class BallPointPen extends Pen {

	public BallPointPen() {
		super("BallPoint");
	}


	@Override
	public String print() {
		return name;
	}

}
