package DesignPattens;

public class FactoryLogger {

    public static Logger getLogger  (String type){
        Logger logger;
        switch (type){
            case "File":
                logger = FileLogger.getInastance();
                break;
            case "Console":
                logger = ConsoleLogger.getInastance();
                break;
            case "Database":
                logger = new DatabaseLoggerAdapter(DatabaseLogger.getInstance());
                break;
            default:
                throw new RuntimeException("Unsupported Logger type: " + type);
        }
        return new ProxyLogger(new DecoartorLogger(logger));
    }
}
