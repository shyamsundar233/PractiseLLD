package behavioral.strategy;

public class CheckoutService {
    public static void main(String[] args) {
        PaymentService amazon = new PaymentService(new CreditCardPayment("1234-1234-1234-1234"));
        amazon.checkout(100);

        PaymentService flipkart = new PaymentService(new UPIPayment(12443587L));
        flipkart.checkout(100);
    }
}
