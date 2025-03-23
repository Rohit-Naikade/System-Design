import java.util.Scanner;

public class PaymentService {

    Scanner sc;

    public PaymentService(){
        sc=new Scanner(System.in);
    }

    public void processPayment(Double fee){
        choosePaymentMethod(fee);
    }

    public void choosePaymentMethod(Double fee){
        System.out.println("Amount to be paid:"+ fee);
        System.out.println("Payment Options:");
        System.out.println("1.Cash.");
        System.out.println("2.Credit Card.");
        System.out.println("3.UPI.");
        System.out.println("Choose Payment Strategy:");
        int choice=sc.nextInt();

        Payment payment;
        switch (choice) {
            case 1:
                payment=new Payment(fee, new CashPayment());
                break;
            case 2:
                payment=new Payment(fee, new CreditCardPayment());
                break;
            case 3:
                payment=new Payment(fee, new UPIPayment());
                break;
            default:
                System.out.println("No valid Payment Strategy selected, proccessing via cash!");
                payment=new Payment(fee, new CashPayment());
                break;
        }

        payment.processPayment();
    }
}
