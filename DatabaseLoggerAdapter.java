package DesignPattens;

import java.util.Date;

public class DatabaseLoggerAdapter implements Logger {

    private DatabaseLogger databaseLogger;

    public DatabaseLoggerAdapter(DatabaseLogger databaseLogger) {
        this.databaseLogger = databaseLogger;
    }

    @Override
    public void log(String message) {
        databaseLogger.logError(new Date(), message);
    }
}
