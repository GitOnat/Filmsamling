import java.util.ArrayList;

public class MovieCollection {

    private ArrayList<Movie> movieList;

    public MovieCollection() {
        movieList = new ArrayList<>();
    }

    public ArrayList<Movie> getMovieList() {
        return movieList;
    }

    public void addMovie(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes, String genre) {
        Movie movie = new Movie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
        movieList.add(movie);
    }

    public String toString() {
        String allMovies = "";

        for (Movie movie : movieList) {
            allMovies += movie.toString() + "\n";
        }
        return allMovies;
    }

    public void showList() {
        System.out.println("Here's your complete collection of movies:");
        for (Movie movie : movieList) {
            System.out.println(movie.toString());
        }
    }

    public void searchMovie(String searchMovieTitle) {
        for (Movie movie : movieList) {
            if (movie.getTitle().toLowerCase().contains(searchMovieTitle.toLowerCase())) {
                System.out.println("Movie found:" + "\n");
                System.out.println(movie);
            }
        }
    }
}