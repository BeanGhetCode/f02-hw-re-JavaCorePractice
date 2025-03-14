package LoopFunction;

import java.util.Scanner;

public class Ex18 {
    public static void ktPhepToan(String input) {
        if (input.length() != 5) {
            //Chỉ dùng với a,b,c có 1 chữ số
            System.out.println("Phép toán không hợp lệ");
            return;
        }

        // Kiểm tra phép toán có đúng định dạng a+b=c không
        if (input.charAt(1) != '+' || input.charAt(3) != '=') {
            System.out.println("Phép toán không hợp lệ");
            return;
        }

        // Kiểm tra a, b, c có phải số không
        if (!Character.isDigit(input.charAt(0)) ||
                !Character.isDigit(input.charAt(2)) ||
                !Character.isDigit(input.charAt(4))) {
            System.out.println("Phép toán không hợp lệ");
            return;
        }

        int a = Character.getNumericValue(input.charAt(0));
        int b = Character.getNumericValue(input.charAt(2));
        int c = Character.getNumericValue(input.charAt(4));

        if (a + b == c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phép toán (dạng a+b=c): ");
        String input = scanner.nextLine();
        scanner.close();
        ktPhepToan(input);
    }
}
