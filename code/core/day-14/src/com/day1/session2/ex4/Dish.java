package com.day1.session2.ex4;
enum CaloricLevel {
	DIET, NORMAL, FAT;
}
public class Dish {
	private String name;
	private boolean vegetarian;
	private int calories;

	public enum Type {
		MEAT, FISH, OTHER
	}

	private Type type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Dish(String name, boolean vegetarian, int calories, Type type) {
		super();
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
	}

	public Dish() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Dish [name=" + name + ", vegetarian=" + vegetarian
				+ ", calories=" + calories + ", type=" + type + "]";
	}

}
