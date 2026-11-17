package behavioral.stateMachine;

public class InsertCardState implements ATMMachineState{

    @Override
    public void insertCard(ATMMachine machine) {
        System.out.println("Card Inserted...");
        machine.setCurrentState(new EnterPinState());
    }

    @Override
    public void enterPin(ATMMachine machine) {
        System.out.println("Card is not inserted...");
    }

    @Override
    public void enterAmount(ATMMachine machine) {
        System.out.println("Card is not inserted...");
    }

    @Override
    public void collectCash(ATMMachine machine) {
        System.out.println("Card is not inserted...");
    }
    
}
