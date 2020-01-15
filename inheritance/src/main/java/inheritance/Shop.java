package inheritance;

import java.util.ArrayList;

public class Shop implements Reviewable {
    String shopName;
    String shopDescription;
    int priceCategory;
    ArrayList<Review> shopReviews = new ArrayList<>();

    public Shop(String shopName, String shopDescription, int priceCategory) {
        this.shopName = shopName;
        this.shopDescription = shopDescription;
        this.priceCategory = priceCategory;
        this.shopReviews = shopReviews;
    }

    public String toString() {
        return shopName + " | " + shopDescription + " | " + priceCategory;
    }

    public void addReview(Review review) {
        //Review review = new Review;
        shopReviews.add(review);
    }
}
