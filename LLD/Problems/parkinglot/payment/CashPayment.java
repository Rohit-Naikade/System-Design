public class CashPayment implements PaymentStrategy{
    public void processPayment(Double fee){
        System.out.println("Payment processed via cash for amount: $"+fee);
    }
}
