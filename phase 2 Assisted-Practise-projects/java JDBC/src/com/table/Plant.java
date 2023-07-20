package com.table;

public class Plant {
	public int id;
	public String name;
	public String fruitColor;
	
	public Plant(int id, String name, String fruitColor) {
		this.id = id;
		this.name = name;
		this.fruitColor = fruitColor;
	}

	public String toString() {
		return "Plant [id=" + id + ", name=" + name + ", fruitColor=" + fruitColor + "]";
	}
	
}
