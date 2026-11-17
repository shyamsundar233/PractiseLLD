### Facade Design Pattern
- A facade is just a coordinator class that hides complexity.
- The pattern name is more useful when wrapping all the suboperations in a single place.
- Eg., Placing order in E-Commerce Platform
    - Interface: PaymentProcessor
    - Implementation: CreditCardProcessor, UPIProcessor
    - Other classes: ProductService, InventoryService
    - Service class: OrderService (main class)