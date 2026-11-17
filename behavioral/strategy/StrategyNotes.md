### Strategy Design Pattern
- Strategy replaces conditional logic with polymorphism. 
- Use it when you have different ways of doing the same thing and you want to swap them at runtime.
- Eg., Payment System
    - Interface: PaymentProcessor
    - Implementations: CreditCardPayment, UPIPayment
    - Service class: PaymentService, CheckoutService (main class)