public class UPIPayment implements PaymentStrategy{
    public void processPayment(Double fee){
        System.out.println("Payment processed via UPI for amount: $"+fee);
    }
}
