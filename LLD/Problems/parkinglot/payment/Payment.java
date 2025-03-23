public class Payment {
    Double amount;
    PaymentStrategy paytmenStrategy;

    public Payment(Double amount, PaymentStrategy paymentStrategy){
        this.amount=amount;
        this.paytmenStrategy=paymentStrategy;
    }

    public void processPayment(){
        paytmenStrategy.processPayment(amount);
    }
}
