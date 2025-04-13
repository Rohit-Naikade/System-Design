public class Payment {
    int amount;
    String status;

    public Payment(int amount) {
        this.amount = amount;
        this.status = "INCOMPLETE";
    }

    public void doPayment(){
        status="SUCCESSFUL";
        System.out.println("payment is successful for amount: "+amount);
    }
}
