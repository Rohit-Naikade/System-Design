public class Movie {
    String movieName;
    int movieId;
    int duration;

    public Movie(String movieName, int movieId, int duration) {
        this.movieName = movieName;
        this.movieId = movieId;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", movieId=" + movieId +
                ", duration=" + duration +
                '}';
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
