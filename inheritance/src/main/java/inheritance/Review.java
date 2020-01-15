package inheritance;

import java.util.ArrayList;

public class Review {
    String reviewAuthor;
    String reviewedRestaurant;
    String reviewBody;
    int reviewStarScore;
    ArrayList<Review> allReviews = new ArrayList<>();

    public Review(String reviewAuthor, String reviewedRestaurant, String reviewBody, int reviewStarScore) {
        this.reviewAuthor = reviewAuthor;
        this.reviewedRestaurant = reviewedRestaurant;
        this.reviewBody = reviewBody;
        this.reviewStarScore = reviewStarScore;
    }

    public String toString() {
        return reviewAuthor + " gave " + reviewedRestaurant + " " + reviewStarScore + " stars: " + reviewBody;
    }


}
