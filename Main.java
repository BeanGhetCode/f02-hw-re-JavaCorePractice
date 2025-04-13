package DesignPattens;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void log (String message) {
        FactoryLogger.getLogger("File").log(message);
        FactoryLogger.getLogger("Console").log(message);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
            }
            catch (InputMismatchException e){
                log ("Invalid input");
                scanner.nextLine();
            } catch (ArithmeticException e) {
                log ("Cannot divide by zero");
            }
            catch (Exception e){
                log("Unknow error");
            }
        }

    }
}
