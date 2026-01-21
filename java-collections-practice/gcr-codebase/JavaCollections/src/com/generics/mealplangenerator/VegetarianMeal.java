package com.generics.mealplangenerator;

public class VegetarianMeal implements MealPlan{
	private String mealName;
    private int calories;
    
 // constructor to initiate class
	public VegetarianMeal(String mealName, int calories) {
		this.mealName = mealName;
		this.calories = calories;
	}

//	Overriding the methods as per requirement of class
	@Override
	public String getMealName() {
		return mealName;
	}

	@Override
	public int getCalories() {
		return calories;
	}

	@Override
	public String getCategory() {
		return "Vegetarian Meal";
	}

	@Override
	public void displayMeal() {
		System.out.println(mealName+" | "+calories+" kcal | "+"Vegetarian meal.\n");
	}
}