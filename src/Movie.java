public class Movie {

    private String title;
    private String director;
    private int yearCreated;
    private boolean isInColor;
    private int lengthInMinutes;
    private String genre;

    public Movie(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes, String genre) {
        this.title = title;
        this.director = director;
        this.yearCreated = yearCreated;
        this.isInColor = isInColor;
        this.lengthInMinutes = lengthInMinutes;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public boolean getIsInColor() {
        return isInColor;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public String getGenre() {
        return genre;
    }

    public String toString() {
        String isInColorAsString = isInColor ? "yes" : "no";
        String result = "";
        result += "Movie title: " + title + "\n" + "Director: " + director + "\n" + "Release year: " + yearCreated + "\n" + "Is the movie in color: " + isInColorAsString + "\n" + "Length (minutes): " + lengthInMinutes + "\n" + "Genre: " + genre + "\n";
        return result;
    }
}
