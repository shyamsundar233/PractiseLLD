package behavioral.observer;

public interface ObserverManager {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObserver(String oldValue, String newValue);
}
