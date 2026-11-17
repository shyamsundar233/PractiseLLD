package creational.singleton;

public class DatabaseManager {
    
    private static  DatabaseManager databaseManager;

    public static DatabaseManager getInstance(){
        if(databaseManager == null){
            System.out.println("Instance Created...");
            databaseManager = new DatabaseManager();
        }
        return databaseManager;
    }

    public void query(String query){
        System.out.println("Query Executed: " + query);
    }
}
