package VariableDataTypeIO;

import java.util.Scanner;

public class Console05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap chieu cao: ");
        String height = scanner.nextLine();
        scanner.close();
        System.out.println("Ho va ten: "+ name);
        System.out.println("Tuoi: " + age);
        System.out.println("Chieu cao: " + height);
        scanner.close();
    }
}
