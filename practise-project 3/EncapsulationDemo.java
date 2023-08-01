package com.java2;

class Book{
	private String title;
	private String author;
	private int pages;
	
	
	public Book(String title, String author, int pages) {
		setTitle(title);
		setAuthor(author);
		setPages(pages);
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public String toString() {
		return title+" was written by '"+author+"' containing "+pages+" pages";
	}
	
	
}


public class EncapsulationDemo {

	public static void main(String[] args) {
		Book b1=new Book("Nightmare","sai wayne",51);
		Book b2=new Book("Blood bat moon","christopher nolan",95);
		System.out.println(b1.toString());
		System.out.println(b2.toString());
	}

}
