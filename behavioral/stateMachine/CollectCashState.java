package behavioral.stateMachine;

public class CollectCashState implements ATMMachineState{

    @Override
    public void insertCard(ATMMachine machine) {
        System.out.println("Card already inserted...");
    }

    @Override
    public void enterPin(ATMMachine machine) {
        System.out.println("PIN Already entered...");
    }

    @Override
    public void enterAmount(ATMMachine machine) {
        System.out.println("Amount Already Entered...");
    }

    @Override
    public void collectCash(ATMMachine machine) {
        System.out.println("Collect Your Cash...");
        machine.setCurrentState(new InsertCardState());
    }

}
