public class BikeVehicle extends Vehicle{
    double RATE=5;

    public BikeVehicle(String licensePlate){
        super(licensePlate, "Bike");
    }

    public double calculateFee(int hoursSaved){
        return RATE*hoursSaved;
    }
}
