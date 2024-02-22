import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<Movie> movieCollection;

    public Controller() {
        this.movieCollection = new ArrayList<>();
    }

    public List<Movie> getMovieCollection() {
        return movieCollection;
    }

    public void addMovie(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes, String genre) {
        Movie movie = new Movie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
        movieCollection.add(movie);
    }
}
