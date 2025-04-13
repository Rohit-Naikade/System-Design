import enums.City;

import java.util.*;

public class TheatreController {
    Map<City, List<Theatre>> cityVsTheatre;
    List<Theatre> allTheatres;

    public TheatreController() {
        this.cityVsTheatre =new HashMap<>();
        this.allTheatres = new ArrayList<>();
    }

    public Map<City, List<Theatre>> getCityVsTheatre() {
        return cityVsTheatre;
    }

    public void setCityVsTheatre(Theatre theatre, City city) {
        cityVsTheatre.computeIfAbsent(city, k -> new ArrayList<>()).add(theatre);

        setAllTheatres(theatre);
    }

    public List<Theatre> getAllTheatres() {
        return allTheatres;
    }

    public void setAllTheatres(Theatre theatre) {
        this.allTheatres.add(theatre);
    }
}
