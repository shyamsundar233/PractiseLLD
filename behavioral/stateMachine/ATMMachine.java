package behavioral.stateMachine;

public class ATMMachine {
    private ATMMachineState currentState;

    public ATMMachine(){
        this.currentState = new InsertCardState();
    }

    public void insertCard() {
        currentState.insertCard(this);
    }

    public void enterPin() {
        currentState.enterPin(this);
    }

    public void enterAmount() {
        currentState.enterAmount(this);
    }

    public void collectCash() {
        currentState.collectCash(this);
    }

    public void setCurrentState(ATMMachineState nextState){
        this.currentState = nextState;
    }
}
