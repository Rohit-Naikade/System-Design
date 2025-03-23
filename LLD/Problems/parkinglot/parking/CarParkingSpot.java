public class CarParkingSpot extends ParkingSpot{

    public CarParkingSpot(int spotNumber){
        super(spotNumber, "Car");
    }

    public boolean canParkVehicle(Vehicle vehicle){
        return "Car".equalsIgnoreCase(vehicle.getVehicleType());
    }

}
