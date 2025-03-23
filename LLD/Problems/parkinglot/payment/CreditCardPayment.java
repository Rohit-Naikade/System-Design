public class CreditCardPayment implements PaymentStrategy{
    public void processPayment(Double fee){
        System.out.println("Payment processed via Credit Card for amount: $"+fee);
    }
}
