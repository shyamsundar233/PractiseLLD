package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class AccountObserverManager implements ObserverManager{

    List<Observer> observers = new ArrayList<>();
    private String username;

    public AccountObserverManager(String username){
        System.out.println("Username initialized: " + username);
        this.username = username;
    }

    @Override
    public void add(Observer observer) {
        System.out.println("Observer added: " + observer.getClass().getCanonicalName());
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        System.out.println("Observer removed: " + observer.getClass().getCanonicalName());
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String oldValue, String newValue) {
        this.username = newValue;
        System.out.println("New Username Updated: " + username);
        for (Observer observer : observers) {
            System.out.println("Notifying Observer: " + observer.getClass().getCanonicalName());
            observer.update(oldValue, username);
        }
    }
    
}
