public class ExitGate {
    private ParkingLot parkingLot;
    private PaymentService paymentService;

    public ExitGate(ParkingLot parkingLot, PaymentService paymentService){
        this.parkingLot=parkingLot;
        this.paymentService=paymentService;
    }

    public void processExit(int spotNumber, int hoursStayed){
        ParkingSpot spot=parkingLot.getSpotByNumber(spotNumber);

        if(spot==null && !spot.isOccupied()){
            System.out.println("Invalid or vacant spot!");
            return;
        }

        Vehicle vehicle=spot.getVehicle();

        if(vehicle==null){
            System.out.println("No vehicle found in the spot!");
        }

        double fee=vehicle.calculateFee(hoursStayed);
        paymentService.processPayment(fee);

        parkingLot.vacateSpot(spot, vehicle);
        System.out.println("Spot vacated successfully!");


    }
}
