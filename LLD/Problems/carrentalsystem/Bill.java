public class Bill {
    int amount;
    String paymentStatus;
    public Bill(){
        amount=100;
        paymentStatus="INCOMPLETE";
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "amount=" + amount +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }

    public void makePayment(){
        Payment.makePayment(amount);
        paymentStatus="COMPLETED";
    }
}
