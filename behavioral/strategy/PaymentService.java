package behavioral.strategy;

public class PaymentService {

    private PaymentProcessor paymentProcessor;

    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double amount){
        paymentProcessor.pay(amount);
    }
}
