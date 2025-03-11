package LoopFunction;

import java.util.Scanner;

public class Ex10 {
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) return 1;

        int f1 = 1, f2 = 1;
        int result = 0;

        for (int i = 3; i <= n; i++) {
            result = f1 + f2;
            f1 = f2;
            f2 = result;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên n > 0: ");
        int n = scanner.nextInt();
        if (n<0){
            System.out.println("Nhập số nguyên n > 0 ");
        }
        else{
            System.out.println(fibonacci(n));
        }
        scanner.close();

    }



}
