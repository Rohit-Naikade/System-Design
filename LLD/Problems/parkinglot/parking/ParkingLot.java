import java.util.*;

public class ParkingLot {
    List<ParkingFloor> floors;

    public ParkingLot(List<ParkingFloor> floors){
        this.floors=floors;
    }

    public ParkingSpot findAvailableSpot(String vehicle){
        for(ParkingFloor floor: floors){
            ParkingSpot spot=floor.findAvailableSpot(vehicle);
            if(spot!=null){
                return spot;
            }
        }

        return null;
    }

    public ParkingSpot parkVehicle(Vehicle vehicle){
        ParkingSpot spot= findAvailableSpot(vehicle.getVehicleType());

        if(spot!=null){
            spot.parkVehicle(vehicle);
            System.out.println("Vehicle parked successfully in spot: "+spot.getSpotNumber());
            return spot;
        }
        System.out.println("No parking slots are available for "+vehicle.getVehicleType());
        return null;
    }

    public void vacateSpot(ParkingSpot spot, Vehicle vehicle){
        if(spot!=null && spot.isOccupied() && spot.getVehicle().equals(vehicle)){
            spot.vacate();
            System.out.println(vehicle.getVehicleType()+" vacated a spot: "+spot.getSpotNumber());
            return;
        }

        System.out.println("Spot is already vacant or vehicle does not match!");
    }

    public ParkingSpot getSpotByNumber(int spotNumber){
        for(ParkingFloor floor: floors){
            for(ParkingSpot spot: floor.getParkingSpots()){
                if(spot.getSpotNumber()==spotNumber){
                    return spot;
                }
            }
        }

        return null;
    }

    public List<ParkingFloor> getFlooors(){
        return floors;
    }
}
