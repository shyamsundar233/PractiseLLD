package behavioral.stateMachine;

public interface ATMMachineState {
    void insertCard(ATMMachine machine);
    void enterPin(ATMMachine machine);
    void enterAmount(ATMMachine machine);
    void collectCash(ATMMachine machine);
}
