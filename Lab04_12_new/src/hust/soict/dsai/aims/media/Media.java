package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    // Constructor
    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    // toString
    @Override
    public String toString() {
        return "Media[id=" + id + ", title=" + title + ", category=" + category + ", cost=" + cost + "$]";
    }

    // Comparators
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new Comparator<Media>() {
        @Override
        public int compare(Media m1, Media m2) {
            int titleComparison = m1.getTitle().compareTo(m2.getTitle());
            if (titleComparison == 0) {
                return Float.compare(m2.getCost(), m1.getCost()); // Higher cost first
            }
            return titleComparison;
        }
    };

    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new Comparator<Media>() {
        @Override
        public int compare(Media m1, Media m2) {
            int costComparison = Float.compare(m2.getCost(), m1.getCost()); // Higher cost first
            if (costComparison == 0) {
                return m1.getTitle().compareTo(m2.getTitle()); // Alphabetical order
            }
            return costComparison;
        }
    };
}