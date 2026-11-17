package behavioral.observer;

public class CRMObserver implements Observer{

    @Override
    public void update(String oldValue, String newValue) {
        System.out.println("CRM Observer called...");
        System.out.println("Updated values :: old value :: " + oldValue + " :: new value :: " + newValue);
    }
    
}
