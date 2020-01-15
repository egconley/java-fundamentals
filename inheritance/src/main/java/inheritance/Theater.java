package inheritance;

import java.util.ArrayList;

public class Theater {

    String theaterName;
    int starScore;
    int priceCategory;
    ArrayList<String> moviesShowing = new ArrayList<>();

    public Theater(String theaterName, int starScore, int priceCategory) {
        this.theaterName = theaterName;
        this.moviesShowing = moviesShowing;
    }

    public void addMovie(String movie) {
        this.moviesShowing.add(movie);
    }

    public void removeMove(String movie) {
        for (int i=0; i<moviesShowing.size(); i++) {
            if (moviesShowing.get(i).equals(movie)) moviesShowing.remove(i);
        }
    }

    public String toString() {
        StringBuilder movieList = new StringBuilder();
        movieList.append("Showing at " + theaterName + ": ");
        for (int i=0; i<moviesShowing.size(); i++) {
            if (i==(moviesShowing.size()-1)) {
                movieList.append(moviesShowing.get(i));
            } else {
                movieList.append(moviesShowing.get(i) + ", ");
            }
        }
        return movieList.toString();
    }
}
