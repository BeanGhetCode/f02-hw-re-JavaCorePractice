
import java.util.Scanner;

public class Ex16 {
    public static boolean ktChuSo (int n){
        int lastNum = n % 10;
        while (n >= 10){
            n = n / 10;
        }
        return lastNum == n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương (tối đa 9 chữ số): ");
        int n = scanner.nextInt();
        scanner.close();

        if (n < 10 || n > 999999999) {
            System.out.println("Vui lòng nhập số có từ 2 đến 9 chữ số!");
        } else {
            if (ktChuSo(n)) {
                System.out.println("Số " + n + " có chữ số đầu và cuối giống nhau.");
            } else {
                System.out.println("Số " + n + " KHÔNG có chữ số đầu và cuối giống nhau.");
            }
        }
    }
}
