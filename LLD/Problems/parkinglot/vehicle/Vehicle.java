public abstract class Vehicle {
    
    String licensePlate, vehicleType;

    public Vehicle(String licensePlate, String vehicleType){
        this.licensePlate=licensePlate;
        this.vehicleType=vehicleType;
    }

    public String getVehicleType(){
        return vehicleType;
    }
    public void setVehicleType(String vehicleType){
        this.vehicleType=vehicleType;
    }
    public String getLicensePlate(){
        return licensePlate;
    }
    public void getVehicleType(String licensePlate){
        this.licensePlate=licensePlate;
    }
    public abstract double calculateFee(int hoursSaved);
}
