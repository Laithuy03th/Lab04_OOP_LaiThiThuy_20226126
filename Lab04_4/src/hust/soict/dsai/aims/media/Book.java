package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	public Book(int id, String title, String category, float cost) {
		super(id, title, category, cost);
		// TODO Auto-generated constructor stub
	}

	private List<String> authors = new ArrayList<String>();
	

	public Book(int id, String title, String category, float cost, List<String> authors) {
		super(id, title, category, cost);
		this.authors = authors;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	
	

	
	

}
