package inheritance;

import java.util.ArrayList;

public class Restaurant implements Reviewable {

    String restaurantName;
    int starScore;
    int priceCategory;
    ArrayList<Review> restaurantReviews = new ArrayList<>();

    public Restaurant(String restaurantName, int starScore, int priceCategory) {
        this.restaurantName = restaurantName;
        this.starScore = starScore;
        this.priceCategory = priceCategory;
        this.restaurantReviews = restaurantReviews;
    }

    public void addRestaurantReview(String reviewAuthor, String reviewedBusiness, String reviewBody, int reviewStarScore) {
        RestaurantReview review = new RestaurantReview(reviewAuthor, reviewedBusiness, reviewBody, reviewStarScore);
        //restaurantReviews.add(review);
        addReview(review);
        updateStarScore();
    }

    public void addReview(Review review) {
        this.restaurantReviews.add(review);
    }

    public void updateStarScore() {
        int starSum = 0;
        int reviewCount = 0;
        for (int i=0; i<restaurantReviews.size(); i++) {
            starSum += restaurantReviews.get(i).reviewStarScore;
            //System.out.println("restaurantReviews.get(i).reviewStarScore = " + restaurantReviews.get(i).reviewStarScore);
            reviewCount++;
            //System.out.println("reviewCount = " + reviewCount);
        }
        this.starScore = starSum/reviewCount;
        //System.out.println("starSum/reviewCount = " + starSum/reviewCount);
    }

    public String toString() {
        return restaurantName + " | " + starScore + " | " + priceCategory;
    }
}
