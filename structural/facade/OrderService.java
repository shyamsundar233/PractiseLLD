package structural.facade;

public class OrderService {

    private InventoryService inventoryService;
    private ProductService productService;
    private PaymentProcessor paymentProcessor;

    public OrderService(InventoryService inventoryService, ProductService productService,
            PaymentProcessor paymentProcessor) {
        this.inventoryService = inventoryService;
        this.productService = productService;
        this.paymentProcessor = paymentProcessor;
    }

    public void placeOrder(String productName, int qty){
        int availableQty = inventoryService.getAvailableQty(productName);
        if(availableQty < qty){
            System.out.println("Order cannot be placed as the requested qty is not available");
            System.out.println(productName + " : " + qty);
            return;
        }
        int price = productService.getPrice(productName);        
        int total = qty * price;
        System.out.println("Bill");
        System.out.println(productName + " : " + qty  + " * " + price);
        System.out.println("Total: " + total);
        paymentProcessor.pay(total);

        System.out.println("Order Placed Successfully");
    }
}
