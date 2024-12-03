package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.List;
import java.util.Scanner;


public class Book{
	private int id;
	private String title;
	private String category;
	private float cost;
	private List<String> authors = new ArrayList<String>();
	public Book() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		if(!authors.contains(authorName)) {
			authors.add(authorName);
		}else {
			System.out.println("Author " + authorName + " is in the list ");
		}
	}
	
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)) {
			authors.remove(authorName);
		}else {
			System.out.println("Author " + authorName + " isn't in the list ");
		}
	}
	
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	
    	    return "Book Details:\n" +
    	           "ID: " + id + "\n" +
    	           "Title: " + title + "\n" +
    	           "Category: " + category + "\n" +
    	           "Cost: " + cost + "\n" +
    	           "Authors: " + authors;
    	

    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book book = new Book();
		System.out.println("nhap vao book ID : ");
		book.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("nhap vao book Title : ");
		book.setTitle(sc.nextLine());
		
		System.out.print("nhap vao book category: ");
	    book.setCategory(sc.nextLine());

	    System.out.print("nhap vao book cost: ");
	    book.setCost(sc.nextFloat());
	    sc.nextLine();
	    System.out.println("nhap vao so luong tac gia");
	    int soLuongTacGia = sc.nextInt();
	    sc.nextLine();
	    System.out.println("nhap vao danh sach tac gia: ");
	    for(int i = 0;i<soLuongTacGia;i++) {
	    	System.out.println("author " +(i + 1) + ":");
	    	String authorName = sc.nextLine();
	    	book.addAuthor(authorName);
	    }
	    System.out.println("Thong tin sach: " + book.toString());
	    
	   System.out.println("nhap ten tac gia can xoa: ");
	   String authorNameRemove = sc.nextLine();
	   book.removeAuthor(authorNameRemove);
	    System.out.println("Thong tin sach: " + book.toString());
	    
	    
	}
	
	
}