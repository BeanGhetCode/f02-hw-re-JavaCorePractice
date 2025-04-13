package DesignPattens;

import java.util.Date;

public class ConsoleLogger implements Logger{
    //Lazy Inntialization (Singleton Pattern)

    private static  ConsoleLogger INSTANCE;
    public static ConsoleLogger getInastance (){
        if(INSTANCE == null){
            INSTANCE = new ConsoleLogger();
        }
        return INSTANCE;
    }

    @Override
    public void log(String message) {
        System.out.printf("[%s] %s", new Date(), message);
    }
}
