import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();

        int programState = 0;
        int sentinel = 4;

        System.out.println("Welcome to your movie collection!");

        while (programState != sentinel) {

            System.out.println("1. Add a movie to your collection");
            System.out.println("2. Search for a movie in your collection");
            System.out.println("3. Show complete movie collection");
            System.out.println("4. Leave/end program");

            programState = scanner.nextInt();
            scanner.nextLine();

            if (programState == 1) {

                System.out.println("Movie title:");
                String title = scanner.nextLine();

                System.out.println("Director name:");
                String director = scanner.nextLine();

                System.out.println("Release year:");
                int yearCreated = scanner.nextInt();

                System.out.println("Is the movie in color? (yes/no):");
                boolean isInColor = scanner.next().equalsIgnoreCase("yes");

                System.out.println("Movie length in minutes:");
                int lengthInMinutes = scanner.nextInt();

                scanner.nextLine();

                System.out.println("Movie genre:");
                String genre = scanner.next();

                controller.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);

                System.out.println("Movie successfully added to your movie collection.");
                System.out.println();
            }

            else if (programState == 2) {
                String searchMovieTitle = scanner.next();
                controller.searchMovie(searchMovieTitle);
            }

            else if (programState == 3) {
                controller.showList();
                }

            else if (programState == 4) {
                scanner.close();
                }
        }
    }
}