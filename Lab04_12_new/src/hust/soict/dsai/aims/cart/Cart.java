package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.*;
import java.util.ArrayList;
import java.util.Collections;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    // Thêm một mục Media vào giỏ hàng
    public void addMedia(Media media) {
        if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full. Cannot add more items.");
        } else if (itemsOrdered.contains(media)) {
            System.out.println("The media item is already in the cart.");
        } else {
            itemsOrdered.add(media);
            System.out.println("The media item has been added.");
        }
    }

    // Xóa một mục Media khỏi giỏ hàng
    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("The media item has been removed.");
        } else {
            System.out.println("The media item was not found in the cart.");
        }
    }

    // Tính tổng chi phí của các mục trong giỏ hàng
    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    // Hiển thị chi tiết giỏ hàng
    public void displayCart() {
        System.out.println("--- CART DETAILS ---");
        for (Media media : itemsOrdered) {
            System.out.println(media.toString());
        }
        System.out.println("Total cost: " + totalCost() + "$\n");
    }

    // Sắp xếp các mục theo tiêu đề, sau đó theo giá
    public void sortByTitleThenCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
        System.out.println("The cart has been sorted by title, then by cost.");
    }

    // Sắp xếp các mục theo giá, sau đó theo tiêu đề
    public void sortByCostThenTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
        System.out.println("The cart has been sorted by cost, then by title.");
    }

    // Phương thức main để kiểm tra
    public static void main(String[] args) {
        Cart cart = new Cart();

        // Tạo các mục Media
        DigitalVideoDisc dvd = new DigitalVideoDisc(1, "The Lion King", "Animation", 19.95f, 87, "Roger Allers");
        Book book = new Book(2, "Effective Java", "Programming", 45.99f, new ArrayList<>());
        CompactDisc cd = new CompactDisc(3, "Thriller", "Music", 15.99f, 42, "Quincy Jones", new ArrayList<>(), "Michael Jackson");

        // Thêm các mục vào giỏ hàng
        cart.addMedia(dvd);
        cart.addMedia(book);
        cart.addMedia(cd);

        // Hiển thị giỏ hàng ban đầu
        System.out.println("=== Initial Cart ===");
        cart.displayCart();

        // Sắp xếp theo tiêu đề rồi giá và hiển thị
        cart.sortByTitleThenCost();
        System.out.println("\n=== Cart Sorted by Title, then Cost ===");
        cart.displayCart();

        // Sắp xếp theo giá rồi tiêu đề và hiển thị
        cart.sortByCostThenTitle();
        System.out.println("\n=== Cart Sorted by Cost, then Title ===");
        cart.displayCart();
    }
}
