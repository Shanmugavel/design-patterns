/**
 * 
 */
package xyz.shanmugavel.creational.abstractfactory;

/**
 * @author Shanmugavel_S01
 *
 */
public abstract class Pen {
	protected String name;
	
	public Pen(String name) {
		this.name = name;
	}
	public abstract String print();
}
