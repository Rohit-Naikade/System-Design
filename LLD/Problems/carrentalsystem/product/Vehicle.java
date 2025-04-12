package product;

public class Vehicle {
    int vehicleId;
    int vehicleNumber;
    String companyName;
    String modelName;
    int kmDriven;
    VehicleType vehicleType;
    Status status;

    public Vehicle(int vehicleId, int vehicleNumber, String companyName, String modelName, int kmDriven, VehicleType vehicleType, Status status){
        this.vehicleId=vehicleId;
        this.vehicleNumber=vehicleNumber;
        this.companyName=companyName;
        this.modelName=modelName;
        this.kmDriven=kmDriven;
        this.vehicleType=vehicleType;
        this.status=status;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", vehicleNumber=" + vehicleNumber +
                ", companyName='" + companyName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", kmDriven=" + kmDriven +
                ", vehicleType=" + vehicleType +
                '}';
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public int getKmDriven() {
        return kmDriven;
    }

    public String getModelName() {
        return modelName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }
}
