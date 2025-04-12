import product.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventoryMgt {
    Store store;
    List<Reservation> reservations;
    public VehicleInventoryMgt(Store store){
        this.store=store;
        reservations=new ArrayList<>();
    }

    public void doReservation(User user, Vehicle vehicle){
        Reservation reserve=Reservation.reserve(1, vehicle, user);
        reservations.add(reserve);
        System.out.println("Reservation successful!"+reserve.toString());
    }

    @Override
    public String toString() {
        return "VehicleInventoryMgt{" +
                "store=" + store +
                '}';
    }
}
