package behavioral.strategy;

public class CreditCardPayment implements PaymentProcessor{

    private String creditCardNumber;

    public CreditCardPayment(String creditCardNumber){
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("\n----------------------------\n");
        System.out.println("Amount paid through Credit Card");
        System.out.println("Card Number: " + creditCardNumber);
        System.out.println("Amount: " + amount);
        System.out.println("\n----------------------------\n");
    }
    
}
