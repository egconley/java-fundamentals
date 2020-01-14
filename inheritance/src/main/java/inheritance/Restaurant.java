package inheritance;

public class Restaurant {
    int[] starRange = new int[]{0,1,2,3,4,5};

    String restaurantName;
    int starScore;
    String priceCategory;

    public Restaurant(String restaurantName, int starScore, String priceCategory) {
        this.restaurantName = restaurantName;
        this.starScore = starScore;
        this.priceCategory = priceCategory;
    }

    public String toString() {
        return restaurantName + " | " + starScore + " | " + priceCategory;
    }
}
