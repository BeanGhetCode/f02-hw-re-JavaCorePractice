package LoopFunction;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Cần ít nhất 2 số để tìm số lớn thứ 2!");
            return;
        }

        int max1 = -1, max2 = -1; // Giả sử dãy chỉ có số không âm
        System.out.println("Nhập dãy số nguyên không âm:");

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num < 0){
                System.out.println("Nhập số nguyên không âm !");
                break;
            }
            else if (num > max1) {
                max2 = max1;
            } else if (num > max2 && num < max1) {
                max2 = num;
            }
        }

        if (max2 == -1) {
            System.out.println("Không tồn tại số lớn thứ 2.");
        } else {
            System.out.println("Số lớn thứ 2 trong dãy là: " + max2);
        }

        scanner.close();
    }
}

