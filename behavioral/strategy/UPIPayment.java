package behavioral.strategy;

public class UPIPayment implements PaymentProcessor{

    private Long upiId;

    public UPIPayment(Long upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("\n----------------------------\n");
        System.out.println("Amount paid through UPI");
        System.out.println("UPI ID: " + upiId);
        System.out.println("Amount: " + amount);
        System.out.println("\n----------------------------\n");
    }
    
}
