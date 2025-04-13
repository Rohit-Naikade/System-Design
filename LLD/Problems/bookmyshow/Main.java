import enums.City;
import enums.SeatCategory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static MovieController movieController=new MovieController();
    static TheatreController theatreController=new TheatreController();
    public static void main(String args[]){

        
        //create movies
        createMovies(movieController);

        //create theatres
        createTheatres(theatreController);
        createBooking(City.MUMBAI, "Chhava");
    }

    private static void createBooking(City city, String movieName) {
        List<Movie> movies=movieController.getMovieByCity(city);

        Movie interestedMovie=null;

        for(Movie movie: movies){
            if(movie.getMovieName().equals(movieName)){
                interestedMovie=movie;
            }
        }


    }

    private static void createTheatres(TheatreController theatreController) {
        Movie chhava=movieController.getMovieByName("Chhava");
        Movie war= movieController.getMovieByName("War");
        Movie YJHD= movieController.getMovieByName("YJHD");
        Movie lagaan= movieController.getMovieByName("Lagaan");
        
        Theatre MumbaiTheatre=new Theatre(1, createScreens(), City.MUMBAI);
        List<Show> inoxShows=new ArrayList<>();
        Show inoxMorningShow=new Show(1, chhava, MumbaiTheatre.getScreens().get(0));
        Show inoxEveningShow=new Show(2, war, MumbaiTheatre.getScreens().get(0));
        inoxShows.add(inoxEveningShow);
        inoxShows.add(inoxMorningShow);
        MumbaiTheatre.setShows(inoxShows);

        Theatre PuneTheatre=new Theatre(2, createScreens(), City.PUNE);
        List<Show> pvrShows=new ArrayList<>();
        Show pvrMorningShow=new Show(1, YJHD, PuneTheatre.getScreens().get(0));
        Show pvrEveningShow=new Show(2, lagaan, PuneTheatre.getScreens().get(0));
        pvrShows.add(pvrMorningShow);
        pvrShows.add(pvrEveningShow);
        PuneTheatre.setShows(pvrShows);

        theatreController.setCityVsTheatre(MumbaiTheatre, City.MUMBAI);
        theatreController.setCityVsTheatre(PuneTheatre, City.PUNE);

        System.out.println(theatreController.getCityVsTheatre());
    }

    private static List<Screen> createScreens() {
        List<Screen> screens=new ArrayList<>();
        Screen screen1=new Screen(1, createSeats());
        screens.add(screen1);
        return screens;
    }

    private static List<Seat> createSeats() {
        List<Seat> seats=new ArrayList<>();

        for(int i=0;i<40; i++){
            Seat seat=new Seat(i, SeatCategory.PLATINUM);
            seats.add(seat);
        }
        for(int i=0;i<70; i++){
            Seat seat=new Seat(i, SeatCategory.GOLD);
            seats.add(seat);
        }
        for(int i=0;i<100; i++){
            Seat seat=new Seat(i, SeatCategory.SILVER);
            seats.add(seat);
        }

        return seats;
    }

    private static void createMovies(MovieController movieController) {
        Movie chhava= new Movie("Chhava", 1, 180);
        Movie war= new Movie("War", 2, 180);
        Movie YJHD= new Movie("YJHD", 3, 180);
        Movie lagaan= new Movie("Lagaan", 4, 180);


        movieController.setCityVsMovie(City.MUMBAI, chhava);
        movieController.setCityVsMovie(City.MUMBAI, war);
        movieController.setCityVsMovie(City.PUNE, YJHD);
        movieController.setCityVsMovie(City.PUNE, lagaan);

        System.out.println(movieController.getAllMovies());
        System.out.println(movieController.getCityVsMovie());

    }
}
