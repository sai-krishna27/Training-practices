package com.table;

public class Book {
	public int id;
	public String name;
	public int author_id;
	
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author_id=" + author_id + "]";
	}
	
	
	public Book(int id, String name, int author_id) {
		super();
		this.id = id;
		this.name = name;
		this.author_id = author_id;
	}
}
