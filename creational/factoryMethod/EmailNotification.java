package creational.factoryMethod;

public class EmailNotification implements Notification{

    @Override
    public void pushNotification(String message) {
        System.out.println("Email Notification Sent");
        System.out.println("Message: " + message);
    }
    
}
