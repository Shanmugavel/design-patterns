/**
 * 
 */
package xyz.shanmugavel.creational.builder;

/**
 * @author Shanmugavel_S01
 *
 */
public class AdultMealBuilder extends MealBuilder {

	@Override
	void buildStarter() {
		meal.setStarter("Large Fries");
	}

	@Override
	void buildMainCourse() {
		meal.setMainCourse("Mega Veggie Burger");
	}

	@Override
	void buildDessert() {
		meal.setDessert("Ice Cream");
	}

	@Override
	void buildDrink() {
		meal.setDrink("Coke");
	}

}
