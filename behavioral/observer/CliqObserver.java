package behavioral.observer;

public class CliqObserver implements Observer{

    @Override
    public void update(String oldValue, String newValue) {
        System.out.println("Cliq Observer called...");
        System.out.println("Updated values :: old value :: " + oldValue + " :: new value :: " + newValue);
    }
    
}
