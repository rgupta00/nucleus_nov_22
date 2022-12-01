package com.day1.session2.ex3;

public class Apple {
	private String color;
	private int weight;
	//			boolean				T(this)
	public static boolean isHeavyApple(Apple apple){
		return apple.getWeight()>=350;
	}
	public static boolean isGeenApple(Apple apple){
		return apple.getColor().equals("green");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Apple(String color, int weight) {
		this.color = color;
		this.weight = weight;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Apple{");
		sb.append("color='").append(color).append('\'');
		sb.append(", weight=").append(weight);
		sb.append('}');
		return sb.toString();
	}

	public Apple() {
	}

}