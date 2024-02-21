import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MovieCollection myCollection = new MovieCollection();

        System.out.println("To add a movie to your movie collection, follow the instructions below.");

        System.out.println("Movie title:");
        String title = scanner.nextLine();

        System.out.println("Director name:");
        String director = scanner.nextLine();

        System.out.println("Release year:");
        int yearCreated = scanner.nextInt();

        System.out.println("Is the movie in color? (type true for yes or false for no):");
        boolean isInColor = scanner.nextBoolean();

        System.out.println("Movie length in minutes:");
        int lengthInMinutes = scanner.nextInt();

        System.out.println("Movie genre:");
        String genre = scanner.next();

        myCollection.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);

        System.out.println("Movie successfully added to your movie collection.");
    }
}