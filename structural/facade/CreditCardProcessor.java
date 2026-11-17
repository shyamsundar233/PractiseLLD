package structural.facade;

public class CreditCardProcessor implements PaymentProcessor{

    @Override
    public void pay(double amount) {
        System.out.println(amount + " - Amount Paid using Credit Card");
    }
    
}
