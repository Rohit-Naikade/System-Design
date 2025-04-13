import java.util.ArrayList;
import java.util.List;

public class Show {
    int showId;
    Movie movie;
    Screen screen;
    List<Integer> bookedSeats;

    @Override
    public String toString() {
        return "Show{" +
                "showId=" + showId +
                ", movie=" + movie +
                ", screen=" + screen +
                ", bookedSeats=" + bookedSeats +
                '}';
    }

    public Show(int showId, Movie movie, Screen screen) {
        this.showId = showId;
        this.movie = movie;
        this.screen = screen;
        this.bookedSeats=new ArrayList<>();
    }

    public List<Integer> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<Integer> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }
}
