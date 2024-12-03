package hust.soict.dsai.aims.media;

import java.util.List;

public class Book extends Media {
    private List<String> authors;

    public Book(int id, String title, String category, float cost, List<String> authors) {
        super(id, title, category, cost);
        this.authors = authors;
    }

    @Override
    public String toString() {
        return super.toString() + ", authors=" + authors;
    }
}
