package VariableDataTypeIO;

import java.util.Scanner;

public class Console04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ngay thang nam: ");
        int dayInt = scanner.nextInt();
        int monthInt = scanner.nextInt();
        int yearInt = scanner.nextInt();
        scanner.close();
        System.out.printf("%02d/%02d/%04d", dayInt, monthInt, yearInt);
    }
}
