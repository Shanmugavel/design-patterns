/**
 * 
 */
package xyz.shanmugavel.creational.builder;

/**
 * @author Shanmugavel_S01
 *
 */
public abstract class MealBuilder {

	protected Meal meal = new Meal();
	
	abstract void buildStarter();
	abstract void buildMainCourse();
	abstract void buildDessert();
	abstract void buildDrink();
	public Meal getMeal() {
		return meal;
	}
	
}
