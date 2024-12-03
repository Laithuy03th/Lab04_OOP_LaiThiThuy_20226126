
package hust.soict.dsai.aims.media;

import java.util.List;

public class CompactDisc extends Media {
    private int length;
    private String director;
    private List<String> tracks;
    private String artist;

    public CompactDisc(int id, String title, String category, float cost, int length, String director, List<String> tracks, String artist) {
        super(id, title, category, cost);
        this.length = length;
        this.director = director;
        this.tracks = tracks;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return super.toString() + ", length=" + length + " min, director=" + director + ", artist=" + artist;
    }
}
