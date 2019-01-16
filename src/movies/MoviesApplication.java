package movies;
import util.Input;

import java.awt.*;
import java.util.Arrays;

public class MoviesApplication {

        static Movie[] movieList = MoviesArray.findAll();
        static Input input = new Input();

    public static void main(String[] args) {
        boolean appRun = true;
        while(appRun) {
            displayOptions();
            int userInput = input.getInt("Please enter choice:", 0, 7);
            switch (userInput){
                case 0:
                    System.out.println("Good Bye!");
                    appRun = false;
                    break;

                case 1:
                    displayMovies(movieList);
                    break;

                case 2:
                    displayFilteredMovies(movieList, "animated");
                    break;

                case 3:
                    displayFilteredMovies(movieList, "drama");
                    break;

                case 4:
                    displayFilteredMovies(movieList, "horror");
                    break;

                case 5:
                    displayFilteredMovies(movieList, "sci-fi");
                    break;

                case 6:
                    displayFilteredMovies(movieList, "musical");
                    break;

                case 7:
                    createMovie();
                    break;
            }
        }
    }

    private static void displayOptions(){
        System.out.println(
                "What would you like to do?\n" +
                "\n" +
                "0 - Exit\n" +
                "1 - View all movies\n" +
                "2 - View movies in the animated category\n" +
                "3 - View movies in the drama category\n" +
                "4 - View movies in the horror category\n" +
                "5 - View movies in the sci-fi category\n" +
                "6 - View movies in the musical category\n" +
                "7 - Add Movie\n"
        );
    }
    private static void displayMovies(Movie[] movieList){
        for (Movie movie: movieList) {
            System.out.print(movie.getName());
            System.out.print(" -- ");
            System.out.print(movie.getCategory());
            System.out.println();
        }
    }
    private static void displayFilteredMovies(Movie[] movieList, String cat){
        for (Movie movie: movieList) {
            if(movie.getCategory().equals(cat)) {
                System.out.print(movie.getName());
                System.out.print(" -- ");
                System.out.print(movie.getCategory());
                System.out.println();
            }
        }
    }
    private static void createMovie(){
        String name = input.getString("Please enter name of movie:");
        boolean validCategory = true;
        while(validCategory) {
            String category = input.getString("Please enter category (Drama, Horror, Animated, Sci-fi) of movie:").toLowerCase();
            if (category.equals("drama") || category.equals("horror") || category.equals("animated") || category.equals("sci-fi")) {
                movieList = Movie.addMovie(name, category, movieList);
                validCategory = false;
            }
            else{
                System.out.println("Please enter valid category.");
            }
        }
        System.out.println("Movie added!");
    }
}
