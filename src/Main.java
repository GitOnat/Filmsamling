import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MovieCollection myCollection = new MovieCollection();

        System.out.println("Welcome to your movie collection! Type 1 or 2 to choose one of below two options.");
        System.out.println("1. Add a movie to your list");
        System.out.println("2. Leave/end program");
        int programState = scanner.nextInt();
        scanner.nextLine();

        while (programState != 2) {

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

            scanner.nextLine();

            System.out.println("Movie genre:");
            String genre = scanner.next();

            myCollection.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);

            System.out.println("Movie successfully added to your movie collection.");
            System.out.println();
            System.out.println("Add another movie to your list?");
            System.out.println("1. Add another movie");
            System.out.println("2. Leave/end program");

            programState = scanner.nextInt();
            scanner.nextLine();

            if (programState == 2) {
                scanner.close();
            }
        }
    }
}