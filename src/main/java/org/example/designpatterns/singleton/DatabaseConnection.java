package org.example.designpatterns.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DatabaseConnection {
    private static DatabaseConnection dbc = null;
    private static Lock lock = new ReentrantLock();
    String username;
    String password;
    String url;
    int port;

    private DatabaseConnection() {}

    public static DatabaseConnection getInstance() {
        if (dbc == null) {
             lock.lock();
            if (dbc == null) {
                dbc = new DatabaseConnection();
            }
             lock.unlock();
        }
        return dbc;
    }
}
