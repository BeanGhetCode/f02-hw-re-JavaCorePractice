package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW1202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        while(true){
            try {
                System.out.println("Nhập số nguyên : ");
                a = scanner.nextInt();
                break;

            } catch (InputMismatchException ex) {
                System.out.println("Lỗi! Nhập vào một số nguyên ");
                scanner.next();
            }
            catch (Exception ex){
                System.out.println("Có lỗi xãy ra!" + ex.getMessage());
            }
        }
        System.out.println("Số nguyên vừa nhập: " + a);
        scanner.close();

    }
}
