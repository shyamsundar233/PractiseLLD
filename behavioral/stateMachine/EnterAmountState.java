package behavioral.stateMachine;

public class EnterAmountState implements ATMMachineState{

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
        System.out.println("Amount entered: Rs.1000");
        machine.setCurrentState(new CollectCashState());
    }

    @Override
    public void collectCash(ATMMachine machine) {
        System.out.println("Enter Amount to Collect Cash...");
    }

}
