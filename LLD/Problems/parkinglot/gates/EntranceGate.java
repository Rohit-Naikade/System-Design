import java.util.*;

public class EntranceGate {
    ParkingLot parkingLot;

    public EntranceGate(ParkingLot parkingLot){
        this.parkingLot=parkingLot;
    }

    public void processEntrance(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter vehicle number:");
        String vehicleNo=sc.next();
        System.out.println("Enter vehicle type(Bike or Car): ");
        String vehicleType=sc.next();

        Vehicle vehicle=VehicleFactory.createVehicle(vehicleType, vehicleNo);

        if(vehicle==null){
            System.out.println("Invalid vehicle type!");
            return;
        }

        ParkingSpot spot=parkingLot.parkVehicle(vehicle);

        if(spot!=null){
            System.out.println("Vehicle parked successfully in spot: "+spot.getSpotNumber());
        }else{
            System.out.println("No available spots for the vehicle type");
        }
    }
}
