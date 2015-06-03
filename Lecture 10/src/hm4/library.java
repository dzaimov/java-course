package hm4;

import java.util.ArrayList;

public class library{
	protected String name;
	protected String adress;
	protected ArrayList<book>colection = new ArrayList<book>();
	
	public library(String name, String adress, ArrayList<book>colection){
		setName(name);
		setAdress(adress);
		setBooks(colection);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public ArrayList<book> getColection() {
		return colection;
	}

	public void setBooks(ArrayList<book> colection) {
		this.colection = colection;
	}
	
	public void addBook(book newBook){
		colection.add(newBook);
	}
	public void removeBook(book oldBook){
		colection.remove(oldBook);
	}
	
	public void printInfo(){
		System.out.println("Library name: " + name);
		System.out.println("Library adress: " + adress);
		System.out.println("Books colection: ");
		for (int i = 0; i < colection.size(); i++) {
			System.out.println("Book name: " + colection.get(i).getBookName());
			System.out.println("Book author: " + colection.get(i).getAuthor());
			System.out.println("Pages: " + colection.get(i).getPages());
		}
	}
}
