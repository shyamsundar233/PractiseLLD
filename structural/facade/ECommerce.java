package structural.facade;

public class ECommerce {
    public static void main(String[] args) {
        System.out.println("\n----------------------------------\n");
        OrderService orderService = new OrderService(new InventoryService(), new ProductService(), new CreditCardProcessor());
        orderService.placeOrder("Milk", 5);
        System.out.println("\n----------------------------------\n");
        orderService.placeOrder("Ghee", 20);
        System.out.println("\n----------------------------------\n");
        orderService = new OrderService(new InventoryService(), new ProductService(), new UPIProcessor());
        orderService.placeOrder("Butter", 7);
        System.out.println("\n----------------------------------\n");
    }
}
