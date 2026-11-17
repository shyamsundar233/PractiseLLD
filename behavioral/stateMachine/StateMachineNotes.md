### State Machine Design Pattern
- A state machine handles state transitions cleanly. 
- Use it when an object's behavior changes based on its internal state and you have complex state transition rules.
- Eg., ATM Machine
    - State: ATMMachineState
    - States: InsertCardState, EnterPinState, EnterAmountState, CollectCashState
    - Service: ATMMachine, ATMService