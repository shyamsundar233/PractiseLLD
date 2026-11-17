package creational.singleton;

public class QueryManager {
    public static void main(String[] args) {
        DatabaseManager db1 = DatabaseManager.getInstance();
        db1.query("SELECT * from USER");

        DatabaseManager db2 = DatabaseManager.getInstance();
        db2.query("SELECT * from PROFILE");
    }
}
