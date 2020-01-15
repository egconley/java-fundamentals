package inheritance;

public class RestaurantReview extends Review {
    public RestaurantReview(String reviewAuthor, String reviewedBusiness, String reviewBody, int reviewStarScore) {
        super(reviewAuthor, reviewedBusiness, reviewBody);
        this.reviewStarScore = reviewStarScore;
    }
}
