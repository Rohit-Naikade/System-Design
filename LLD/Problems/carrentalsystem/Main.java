import product.Status;
import product.Vehicle;
import product.VehicleType;

public class Main {
    public static void main(String args[]){
        System.out.println("Main Method");

        CarRentalSystem rental=new CarRentalSystem();
        Store mumbai=new Store(1, "Mumbai");
        Store pune=new Store(1, "Pune");

        Vehicle thar=new Vehicle(1, 123, "Mahindra",
                "Thar", 100, VehicleType.CAR, Status.ACTIVE);
        Vehicle harrier=new Vehicle(1, 123, "Tata",
                "Harrier", 100, VehicleType.CAR, Status.ACTIVE);

        mumbai.setVehicles(thar);
        mumbai.setVehicles(harrier);

        User user1=new User(1, "Rohit", "Yes");
        User user2=new User(2, "Kunal", "Yes");

        mumbai.setUsers(user1);
        mumbai.setUsers(user2);

        VehicleInventoryMgt inventoryMgt=mumbai.getInventory();
        inventoryMgt.doReservation(user1, thar);
        //System.out.println(inventoryMgt);
    }
}
