package inheritance;

public class Review {
    String reviewAuthor;
    String reviewBody;
    int reviewStarScore;

    public Review(String reviewAuthor, String reviewBody, int reviewStarScore) {
        this.reviewAuthor = reviewAuthor;
        this.reviewBody = reviewBody;
        this.reviewStarScore = reviewStarScore;
    }

    public String toString() {
        return reviewAuthor + " gave" + " restaurant " + reviewStarScore + " stars: " + reviewBody;
    }
}
