package inheritance;

import java.util.ArrayList;

public class Restaurant {
    int[] starRange = new int[]{0,1,2,3,4,5};

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

    public void addReview(Review review) {
        restaurantReviews.add(review);
        updateStarScore();
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
