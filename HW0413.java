package LoopFunction;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int countMax = 1;
        for (int i =0; i<n; i++){
            System.out.println("Nhap vao so nguyen thu " +(i+1) +"; ");
            int input = scanner.nextInt();

            if (input > max){
                max = input;
                countMax = 1;
            } else if (input == max) {
                countMax ++;
            }
        }
        System.out.println("So lan xuat hien cua " + max + " la: " +countMax);
        scanner.close();
    }
}
