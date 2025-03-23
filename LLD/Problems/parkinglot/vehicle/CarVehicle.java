public class CarVehicle extends Vehicle{
    double RATE=10;

    public CarVehicle(String licensePlate){
        super(licensePlate, "Car");
    }

    public double calculateFee(int hoursSaved){
        return RATE*hoursSaved;
    }
}
