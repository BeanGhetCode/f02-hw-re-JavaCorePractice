import java.util.Scanner;

public class Ex08 {
    public static void rutTien(int n){
        if (n >= 500) {
            System.out.println("Số tờ 500: " + n / 500);
            n %= 500;
        }
        if (n >= 200) {
            System.out.println("Số tờ 200: " + n / 200);
            n %= 200;
        }
        if (n >= 100) {
            System.out.println("Số tờ 100: " + n / 100);
            n %= 100;
        }
        if (n >= 50) {
            System.out.println("Số tờ 50: " + n / 50);
            n %= 50;
        }
        if (n >= 20) {
            System.out.println("Số tờ 20: " + n / 20);
            n %= 20;
        }
        if (n >= 10) {
            System.out.println("Số tờ 10: " + n / 10);
            n %= 10;
        }
        if (n >= 5) {
            System.out.println("Số tờ 5: " + n / 5);
            n %= 5;
        }
        if (n >= 2) {
            System.out.println("Số tờ 2: " + n / 2);
            n %= 2;
        }
        if (n >= 1) {
            System.out.println("Số tờ 1: " + n);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số tiền cần rút: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Cần nhập số tiền lớn hơn 0");
        } else {
            rutTien(n);
        }

        scanner.close();
    }
}
