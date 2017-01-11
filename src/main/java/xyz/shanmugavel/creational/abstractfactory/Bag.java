/**
 * 
 */
package xyz.shanmugavel.creational.abstractfactory;

/**
 * @author Shanmugavel_S01
 *
 */
public abstract class Bag {
	protected String name;
	
	public Bag(String name) {
		this.name = name;
	}
	public abstract String print();
}
