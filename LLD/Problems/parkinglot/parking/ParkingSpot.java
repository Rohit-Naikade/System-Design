public abstract class ParkingSpot {
    int spotNumber;
    boolean isOccupied;
    Vehicle vehicle;
    String spotType;

    public ParkingSpot(int spotNumber, String spotType){
            this.spotNumber=spotNumber;
            this.isOccupied=false;
            this.spotType=spotType;
    }

    public boolean isOccupied(){
        return isOccupied;
    }
    public abstract boolean canParkVehicle(Vehicle vehicle);

    public void parkVehicle(Vehicle vehicle){
        if(isOccupied){
            System.out.println("Spot is already occupied!");
            return;
        }

        if(!canParkVehicle(vehicle)){
            System.out.println("This spot is not suitable for "+vehicle.getVehicleType());
            return;
        }
        this.vehicle=vehicle;
        isOccupied=true;
    }

    public void vacate(){

        if(!isOccupied){
            System.out.println("Th spot is already vacant!");
            return;
        }
        this.vehicle=null;
        this.isOccupied=false;
    }

    public String getSpotType(){
        return spotType;
    }

    public int getSpotNumber(){
        return spotNumber;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public String toString(){
        return "ParkingSpot{"+
                "spotNumber: "+spotNumber+
                ", isOccupied: "+isOccupied+
                ", vehicle: "+(vehicle!=null?vehicle.getLicensePlate():"None")+"}";
    }
}
