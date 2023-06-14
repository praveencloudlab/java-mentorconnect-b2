package com;

import java.util.List;

public class Fruit {

	private int fruitId;
	private String fruitName;
	private String color;
	private String fruitType;
	private int quantity;
	private double price;
	private List<String> varieties;

	public Fruit() {
		// TODO Auto-generated constructor stub
	}

	public Fruit(int fruitId, String fruitName, String color, String fruitType, int quantity, double price,
			List<String> varieties) {
		super();
		this.fruitId = fruitId;
		this.fruitName = fruitName;
		this.color = color;
		this.fruitType = fruitType;
		this.quantity = quantity;
		this.price = price;
		this.varieties = varieties;
	}

	public List<String> getVarieties() {
		return varieties;
	}

	public void setVarieties(List<String> varieties) {
		this.varieties = varieties;
	}

	public int getFruitId() {
		return fruitId;
	}

	public void setFruitId(int fruitId) {
		this.fruitId = fruitId;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFruitType() {
		return fruitType;
	}

	public void setFruitType(String fruitType) {
		this.fruitType = fruitType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
