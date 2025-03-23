public class BikeParkingSpot extends ParkingSpot{

    public BikeParkingSpot(int spotNumber){
        super(spotNumber, "Bike");
    }

    public boolean canParkVehicle(Vehicle vehicle){
        return "Bike".equalsIgnoreCase(vehicle.getVehicleType());
    }
}
