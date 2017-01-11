/**
 * 
 */
package xyz.shanmugavel.creational.abstractfactory;

/**
 * @author Shanmugavel_S01
 *
 */
public class CamelFactory extends StationeryFactory {

	@Override
	Pen getPen() {
		return new BallPointPen();
	}

	@Override
	Bag getBag() {
		return new PaperBag();
	}

}
