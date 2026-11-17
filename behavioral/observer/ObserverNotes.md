### Observer Design Pattern
- Observer lets objects subscribe to events and get notified when something happens. 
- Use it when changes in one object need to trigger updates in other objects.
- Eg., Account Details Update
    - Interface: Observer, ObserverManager
    - Implementations: CRMObserver, CliqObserver, AccountObserverManager
    - Service: AccountService (main class)