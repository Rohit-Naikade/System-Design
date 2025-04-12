import product.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int storeId;
    String location;
    List<User> users;
    List<Vehicle> vehicles;
    VehicleInventoryMgt inventory;

    public Store(int storeId, String location) {
        this.storeId = storeId;
        this.location = location;
        users=new ArrayList<>();
        vehicles=new ArrayList<>();
        inventory=new VehicleInventoryMgt(this);
    }

    public int getStoreId() {
        return storeId;
    }

    public String getLocation() {
        return location;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setUsers(User users) {
        this.users.add(users);
    }

    public void setVehicles(Vehicle vehicles) {
        this.vehicles.add(vehicles);
    }

    public VehicleInventoryMgt getInventory() {
        return inventory;
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeId=" + storeId +
                ", location='" + location + '\'' +
                ", users=" + users +
                ", vehicles=" + vehicles +
                '}';
    }
}
