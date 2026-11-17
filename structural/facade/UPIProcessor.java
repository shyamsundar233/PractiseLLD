package structural.facade;

public class UPIProcessor implements PaymentProcessor{

    @Override
    public void pay(double amount) {
        System.out.println(amount + " - Amount Paid using UPI");
    }
    
}
