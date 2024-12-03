package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Media {
    private int length;
    private String director;

    public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost);
        this.length = length;
        this.director = director;
    }

    @Override
    public String toString() {
        return super.toString() + ", length=" + length + " min, director=" + director;
    }
}
