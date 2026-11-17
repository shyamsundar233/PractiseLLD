package behavioral.observer;

public class AccountService {
    public static void main(String[] args) {
        System.out.println("Updating Username of an user in all the dependent services");        
        AccountObserverManager manager = new AccountObserverManager("shyam");
        manager.add(new CRMObserver());
        manager.add(new CliqObserver());

        manager.notifyObserver("shyam", "sundar");
    }
}
