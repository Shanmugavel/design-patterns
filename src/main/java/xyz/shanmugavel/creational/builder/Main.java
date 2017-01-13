/**
 * 
 */
package xyz.shanmugavel.creational.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Shanmugavel_S01
 *
 */
public class Main {

	private static final Logger LOG = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		MealBuilder kids = new KidsMealBuilder(), adult = new AdultMealBuilder();
		MealDirector director = new MealDirector();
		Meal meal = director.createMeal(kids);
		LOG.info("Meal={}", meal);
		meal = director.createMeal(adult);
		LOG.info("Meal={}", meal);
	}
}
