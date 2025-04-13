package DesignPattens;

public class DecoartorLogger implements Logger {

    private Logger logger;

    public DecoartorLogger (Logger logger){
        this.logger = logger;
    }
    @Override
    public void log(String message) {
        message = message.trim();
        message = message.toUpperCase();
        logger = log(message);
    }
}
