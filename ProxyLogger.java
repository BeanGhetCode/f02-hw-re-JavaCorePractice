package DesignPattens;

public class ProxyLogger implements  Logger{

    private Logger logger;

    public ProxyLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void log(String message) {
        if(message != null && message.isEmpty()){
            logger.log(message);
        }
    }
}