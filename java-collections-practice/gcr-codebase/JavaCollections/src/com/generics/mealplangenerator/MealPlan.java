package com.generics.mealplangenerator;

// interface that has to be implemented if we are creating a meal plan
public interface MealPlan {
	String getMealName();

    int getCalories();

    String getCategory();

    void displayMeal();
}