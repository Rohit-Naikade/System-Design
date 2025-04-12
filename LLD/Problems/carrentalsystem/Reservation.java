import product.Vehicle;

public class Reservation {
    int reservationId;
    Vehicle vehicle;
    User user;
    Bill billing;

    public Reservation(int reservationId, Vehicle vehicle, User user, Bill billing) {
        this.reservationId = reservationId;
        this.vehicle = vehicle;
        this.user = user;
        this.billing = billing;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", vehicle=" + vehicle +
                ", user=" + user +
                ", billing=" + billing +
                '}';
    }

    public static Reservation reserve(int reservationId, Vehicle vehicle, User user){
        Bill bill=new Bill();
        bill.makePayment();
        if(bill.paymentStatus=="COMPLETED"){
            return new Reservation(reservationId, vehicle, user, bill);
        }
        return null;
    }
}
