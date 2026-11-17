package behavioral.stateMachine;

public class EnterPinState implements ATMMachineState{

    @Override
    public void insertCard(ATMMachine machine) {
        System.out.println("Card already inserted...");
    }

    @Override
    public void enterPin(ATMMachine machine) {
        System.out.println("PIN Validated...");
        machine.setCurrentState(new EnterAmountState());        
    }

    @Override
    public void enterAmount(ATMMachine machine) {
        System.out.println("Enter PIN for next step...");
    }

    @Override
    public void collectCash(ATMMachine machine) {
        System.out.println("Enter PIN for next step...");
    }

}
