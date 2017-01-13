/**
 * 
 */
package xyz.shanmugavel.creational.builder;

/**
 * @author Shanmugavel_S01
 *
 */
public class KidsMealBuilder extends MealBuilder {

	@Override
	void buildStarter() {
		meal.setStarter("Little Fries");
	}

	@Override
	void buildMainCourse() {
		meal.setMainCourse("Kid's Veggie Burger");
	}

	@Override
	void buildDessert() {
		meal.setDessert("Salad");
	}

	@Override
	void buildDrink() {
		meal.setDrink("Water");
	}
}
