
import java.util.ArrayList;
import java.util.List;

// Base class Media
abstract class Media {
    private String title;
    private float cost;

    public Media(String title, float cost) {
        this.title = title;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public float getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Media media = (Media) obj;
        return title.equals(media.title);
    }

    @Override
    public String toString() {
        return "Media[title=" + title + ", cost=" + cost + "]";
    }
}

// Subclass CompactDisc
class CompactDisc extends Media {
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(String title, float cost, String artist) {
        super(title, cost);
        this.artist = artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        } else {
            System.out.println("Track already exists: " + track.getTitle());
        }
    }

    public void play() {
        System.out.println("Playing CD: " + getTitle());
        for (Track track : tracks) {
            track.play();
        }
    }

    @Override
    public String toString() {
        return "CompactDisc[title=" + getTitle() + ", artist=" + artist + ", cost=" + getCost() + "]";
    }
}

// Subclass DigitalVideoDisc
class DigitalVideoDisc extends Media {
    private String director;
    private int length;

    public DigitalVideoDisc(String title, float cost, String director, int length) {
        super(title, cost);
        this.director = director;
        this.length = length;
    }

    public void play() {
        System.out.println("Playing DVD: " + getTitle());
        System.out.println("Length: " + length + " minutes");
    }

    @Override
    public String toString() {
        return "DigitalVideoDisc[title=" + getTitle() + ", director=" + director + ", cost=" + getCost() + "]";
    }
}

// Subclass Book
class Book extends Media {
    private String author;
    private int pages;

    public Book(String title, float cost, String author, int pages) {
        super(title, cost);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book[title=" + getTitle() + ", author=" + author + ", pages=" + pages + ", cost=" + getCost() + "]";
    }
}

// Track class
class Track {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void play() {
        System.out.println("Playing track: " + title + " (" + length + " mins)");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Track track = (Track) obj;
        return length == track.length && title.equals(track.title);
    }
}

// Main class for demonstration
public class MediaStoreDemo {
    public static void main(String[] args) {
        // Create media objects
        DigitalVideoDisc dvd = new DigitalVideoDisc("Inception", 19.99f, "Christopher Nolan", 148);
        Book book = new Book("Java Programming", 29.99f, "John Doe", 400);
        CompactDisc cd = new CompactDisc("Greatest Hits", 14.99f, "Some Artist");

        // Add tracks to CD
        cd.addTrack(new Track("Track 1", 5));
        cd.addTrack(new Track("Track 2", 4));

        // Create a list of media
        List<Media> mediaList = new ArrayList<>();
        mediaList.add(dvd);
        mediaList.add(book);
        mediaList.add(cd);

        // Print all media using polymorphism
        System.out.println("***** Media List *****");
        for (Media media : mediaList) {
            System.out.println(media);
        }

        // Demonstrate playing media
        System.out.println("\n***** Playing Media *****");
        for (Media media : mediaList) {
            if (media instanceof DigitalVideoDisc) {
                ((DigitalVideoDisc) media).play();
            } else if (media instanceof CompactDisc) {
                ((CompactDisc) media).play();
            } else {
                System.out.println("Cannot play this media type: " + media.getTitle());
            }
        }
    }
}
