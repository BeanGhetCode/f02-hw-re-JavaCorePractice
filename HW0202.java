package VariableDataTypeIO;

import java.util.Scanner;

public class Console02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap do F muon chuyen: ");
        double F = scanner.nextDouble();
        System.out.println(F + "°F = " + ((F - 32)*(5.0/9)) + "°C");

        System.out.print("Nhap do C muon chuyen: ");
        double C = scanner.nextDouble();
        scanner.close();
        System.out.println(C + "°C = " + ((C * (9.0/5))+32)+ "°F");

    }
}

