package org.example.designpatterns.singleton;

public class DatabaseConnection {
    private static DatabaseConnection dbc = null;
    String username;
    String password;
    String url;
    int port;

    private DatabaseConnection() {}

    public static DatabaseConnection getInstance() {
        if (dbc == null) {
            // lock()
            if (dbc == null) {
                dbc = new DatabaseConnection();
            }
            // unlock()
        }
        return dbc;
    }
}
