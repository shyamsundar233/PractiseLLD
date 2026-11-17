package creational.factoryMethod;

public class NotificationFactory {
    public static Notification create(String type) {
        if(type.equals("SMS")){
            return new SMSNotification();
        }else if(type.equals("Email")){
            return new EmailNotification();
        }else{
            return null;
        }
    }
}
