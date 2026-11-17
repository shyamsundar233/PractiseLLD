package creational.factoryMethod;

public class NotificationService {
    public static void main(String[] args) {
        Notification smsNotification = NotificationFactory.create("SMS");
        smsNotification.pushNotification("Hi! How Are You!!");

        Notification emailNotification = NotificationFactory.create("Email");
        emailNotification.pushNotification("Hello This is an Email Notification");
    }
}
