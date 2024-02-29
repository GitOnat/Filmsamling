import java.util.ArrayList;

public class Controller {
    private MovieCollection movieCollection;


    public Controller() {
        this.movieCollection = new MovieCollection();
    }

    public MovieCollection getMovieCollection() {
        return movieCollection;
    }

    public void addMovie(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes, String genre) {
        movieCollection.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
    }

    public void showList() {
        movieCollection.showList();
    }

    public void searchMovie(String searchMovieTitle) {
        movieCollection.searchMovie(searchMovieTitle);
    }
}