package LoopFunction;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0, am = 0, duong = 0;
        while(true){
            System.out.println("Nhap vao mot so nguyen khac 0: ");
            int i = scanner.nextInt();
            if(i>0){
                duong++;
            }
            else if(i<0){
                am++;
            }
            else break;
            sum += i;
            count++;
        }
        System.out.println("Tong cac so vua nhap: "+sum);
        System.out.println("Trung bình cac so vua nhap: "+(double)sum/count);
        System.out.println("So luong cac so am: "+am);
        System.out.println("So luong cac so duong: "+duong);
        scanner.close();
    }



}
