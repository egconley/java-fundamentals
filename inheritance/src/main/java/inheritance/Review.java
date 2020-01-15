package inheritance;

import java.util.ArrayList;

public class Review {
    String reviewAuthor;
    String reviewedBusiness;
    String reviewBody;
    int reviewStarScore;
    ArrayList<Review> allReviews = new ArrayList<>();

    public Review(String reviewAuthor, String reviewedBusiness, String reviewBody) {
        this.reviewAuthor = reviewAuthor;
        this.reviewedBusiness = reviewedBusiness;
        this.reviewBody = reviewBody;
    }

    public String toString() {
        return reviewAuthor + " gave " + reviewedBusiness + " " + reviewStarScore + " stars: " + reviewBody;
    }
}
