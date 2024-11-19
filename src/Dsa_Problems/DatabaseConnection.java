package Dsa_Problems;

// singleton class
public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("Database connection created:");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connecting to the database...");

    }

    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.connect();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.connect();

        // Checking if both references point to the same instance
        if (db1 == db2) {
            System.out.println("Both db1 and db2 are the same instance.");
        } else {
            System.out.println("db1 and db2 are different instances.");
        }
    }


}
