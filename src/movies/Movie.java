package movies;

import java.util.Arrays;

class Movie {
    private String name;
    private String category;

    Movie(String movie, String cat){
        setName(movie);
        setCategory(cat);
    }
    String getName(){
        return name;
    }
    String getCategory(){
        return category;
    }
    void setName(String name){
        this.name = name;
    }
    void setCategory(String category){
        this.category = category;
    }

    static Movie[] addMovie(String name, String category, Movie[] array){
        Movie newMovie = new Movie(name, category);
        Movie[] tempArray = Arrays.copyOf(array, array.length+1);
        tempArray[array.length] = newMovie;
        return tempArray;
    }
}

