package DesignPattens;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;

public class FileLogger implements Logger {

    private PrintWriter writer;
    private FileLogger() {
        try {
            writer = new PrintWriter("src/DesignPattens/log.txt");
        } catch (FileNotFoundException e) {

        }

    }

    //Eager Inntialization (Singleton Pattern)
    private static final FileLogger INSTANCE = new FileLogger(); //luon duoc khoi tao
    public static FileLogger getInastance (){
        return INSTANCE;
    }


    @Override
    public void log(String message) {
        writer.printf("[%s] %s", new Date(), message);
        writer.flush(); // ghi du lieu ra file nhung khong dong ket noi
    }
}