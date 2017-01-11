/**
 * 
 */
package xyz.shanmugavel.creational.abstractfactory;

/**
 * @author Shanmugavel_S01
 *
 */
public class NatrajFactory extends StationeryFactory {

	@Override
	Pen getPen() {
		return new InkPen();
	}

	@Override
	Bag getBag() {
		return new PlasticBag();
	}
}
