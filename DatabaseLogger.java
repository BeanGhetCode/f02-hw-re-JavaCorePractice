package DesignPattens;

import java.util.Date;

public class DatabaseLogger {

    private static DatabaseLogger INSTANCE = new DatabaseLogger();

    public static DatabaseLogger getInstance() {
        return INSTANCE;
    }

    public void logError (Date date, String message){
        //......
    }
}
