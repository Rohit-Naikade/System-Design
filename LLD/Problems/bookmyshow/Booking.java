public class Booking {
    User user;
    Movie movie;
    String status;
    Payment payment;

    public Booking(User user, Movie movie, String status) {
        this.user = user;
        this.movie = movie;
        this.status = status;
        this.payment=null;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
