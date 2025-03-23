import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ParkingFloor parkingFloor=new ParkingFloor(1, 2, 2);
        List<ParkingFloor> floors=new ArrayList<>();
        floors.add(parkingFloor);
        ParkingLot parkingLot=new ParkingLot(floors);
        
        PaymentService paymentService=new PaymentService();
        EntranceGate entranceGate=new EntranceGate(parkingLot);
        ExitGate exitGate=new ExitGate(parkingLot, paymentService);

        System.out.println("------------------------------------");
        System.out.println("Welcome to parking lot system!");
        System.out.println("------------------------------------");

        boolean exit=false;

        while(!exit){
            showMenu();
            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    parkVehicle(entranceGate);
                    break;
                case 2:
                    vacateSpot(exitGate, sc);
                    break;
                case 3:
                    exit=true;
                    System.out.println("Thank you for using Parking Lot System!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void parkVehicle(EntranceGate entranceGate){
        entranceGate.processEntrance();
    }

    public static void vacateSpot(ExitGate exitGate, Scanner sc){
        System.out.println("Enter spot number to vacate:");
        int spotNumber=sc.nextInt();
        System.out.println("Enter number of hours the vehicle stayed:");
        int hoursStayed=sc.nextInt();
        exitGate.processExit(spotNumber, hoursStayed);
    }
    public static void showMenu(){
        System.out.println("-----------------------------------");
        System.out.println("Please choose an option from below:");
        System.out.println("1.Park a vehicle.");
        System.out.println("Vacate a vehicle spot.");
        System.out.println("3.Exit a system.");
        System.out.println("-----------------------------------");
    }
}
