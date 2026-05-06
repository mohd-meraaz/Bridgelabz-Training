package com.generics.mealplangenerator;

public class MealGeneratorApp {
	public static void main(String[] args) {
		Meal<MealPlan> vegan = new Meal<>();
		vegan.addMeal(new VeganMeal("Chicken",220));
		vegan.addMeal(new VeganMeal("mutton",320));
		vegan.addMeal(new VeganMeal("eggs",50));
		
		Meal<MealPlan> veg = new Meal<>();
		veg.addMeal(new VegetarianMeal("Daal Rice",120));
		veg.addMeal(new VegetarianMeal("Puri Sabji",60));
		
		
		Meal<MealPlan> keto = new Meal<>();
		keto.addMeal(new KetoMeal("Abocardo",70));
		keto.addMeal(new KetoMeal("Butter",230));
		
		
		vegan.viewMeal();
		veg.viewMeal();
		keto.viewMeal();
	}
}
