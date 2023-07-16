package com.table;

public class Author {
	public int id;
	public String name;
	public String email;
	
	
	public Author(int id, String name, String email) {

		this.id = id;
		this.name = name;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
}
