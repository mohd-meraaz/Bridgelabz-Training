package com.generics.mealplangenerator;

public class KetoMeal implements MealPlan{
	// instance variables
	private String mealName;
    private int calories;
    
    // constructor to initiate class
	public KetoMeal(String mealName, int calories) {
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
		System.out.println(mealName+" | "+calories+" kcal | "+"Keto meal.\n");
	}
}