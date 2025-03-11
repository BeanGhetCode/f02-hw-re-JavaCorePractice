package LoopFunction;

import java.util.Scanner;

public class Ex11 {
    public static boolean ktChinhPhuong (int n){
        if( n == 0 | n ==1 ){
            return true;
        }
        for(int i = 2; i<= (n/2); i++){
            if (i*i == n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập giá trị n > 0: ");
        int n = scanner.nextInt();
        if (n < 0 ){
            System.out.println("nhập giá trị n > 0");
        }
        System.out.println("Các số chính phương < n: ");
        for (int i = 0; i < n; i++){
            if(ktChinhPhuong(i) == true){
                System.out.println(i);
            }
        }
        scanner.close();

    }
}
