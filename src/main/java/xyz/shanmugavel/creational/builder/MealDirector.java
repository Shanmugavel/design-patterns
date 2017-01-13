/**
 * 
 */
package xyz.shanmugavel.creational.builder;

/**
 * @author Shanmugavel_S01
 *
 */
public class MealDirector {

	public Meal createMeal(MealBuilder builder) {
		builder.buildDrink();
		builder.buildStarter();
		builder.buildMainCourse();
		builder.buildDessert();
		return builder.getMeal();
	}
}
