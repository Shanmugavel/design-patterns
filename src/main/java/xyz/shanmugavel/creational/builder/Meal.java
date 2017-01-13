/**
 * 
 */
package xyz.shanmugavel.creational.builder;

/**
 * @author Shanmugavel_S01
 *
 */
public class Meal {
	private String drink;
	private String starter;
	private String mainCourse;
	private String dessert;
	public String getDrink() {
		return drink;
	}
	public void setDrink(String drink) {
		this.drink = drink;
	}
	public String getStarter() {
		return starter;
	}
	public void setStarter(String starter) {
		this.starter = starter;
	}
	public String getMainCourse() {
		return mainCourse;
	}
	public void setMainCourse(String mainCourse) {
		this.mainCourse = mainCourse;
	}
	public String getDessert() {
		return dessert;
	}
	public void setDessert(String dessert) {
		this.dessert = dessert;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Meal [drink=");
		builder.append(drink);
		builder.append(", starter=");
		builder.append(starter);
		builder.append(", mainCourse=");
		builder.append(mainCourse);
		builder.append(", dessert=");
		builder.append(dessert);
		builder.append("]");
		return builder.toString();
	}
	
}
