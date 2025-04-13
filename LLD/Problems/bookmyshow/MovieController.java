import enums.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    Map<City, List<Movie>> cityVsMovie;
    List<Movie> allMovies;

    public MovieController() {
        this.cityVsMovie =new HashMap<>();
        this.allMovies = new ArrayList<>();
    }

    public Map<City, List<Movie>> getCityVsMovie() {
        return cityVsMovie;
    }

    public Movie getMovieByName(String movieName){
        for(Movie movie : allMovies){
            if(movie.movieName.equals(movieName)){
                return movie;
            }
        }
        return null;
    }
    public void setCityVsMovie(City city, Movie movie) {
        cityVsMovie.computeIfAbsent(city, k -> new ArrayList<>()).add(movie);

        addNewMovie(movie);
    }

    public List<Movie> getMovieByCity(City city){
        for(Map.Entry<City, List<Movie>> entry: cityVsMovie.entrySet()){
            if(entry.getKey().equals(city)){
                return entry.getValue();
            }
        }

        return null;
    }

    public List<Movie> getAllMovies() {
        return allMovies;
    }

    public void addNewMovie(Movie movie) {
        this.allMovies.add(movie);
    }
}
