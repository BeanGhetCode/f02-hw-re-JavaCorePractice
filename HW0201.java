package VariableDataTypeIO;

import java.util.Scanner;

public class Console01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so can chuyen: ");
        double number = scanner.nextDouble();
        scanner.close();
        double result = number * 2.54;
        System.out.println( number + " inch =  " + result + " cm");
    }
}
