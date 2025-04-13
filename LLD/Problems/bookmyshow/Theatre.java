import enums.City;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    int theatreId;
    List<Screen> screens;
    City city;
    List<Show> shows;

    public Theatre(int theatreId, List<Screen> screens, City city) {
        this.theatreId = theatreId;
        this.screens = screens;
        this.city = city;
        this.shows=new ArrayList<>();
    }

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    public City getCity() {
        return this.city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "theatreId=" + theatreId +
                ", screens=" + screens +
                ", city=" + city +
                ", shows=" + shows +
                '}';
    }
}
