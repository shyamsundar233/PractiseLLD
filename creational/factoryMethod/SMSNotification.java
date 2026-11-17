package creational.factoryMethod;

public class SMSNotification implements Notification{

    @Override
    public void pushNotification(String message) {
        System.out.println("SMS Notification Sent");
        System.out.println("Message: " + message);
    }
    
}
