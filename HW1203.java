package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW1203 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        try{

            System.out.println("Nhập số nguyên thứ nhất: ");
            a = scanner.nextInt();

            System.out.println("Nhập số nguyên thứ hai: ");
            b = scanner.nextInt();

            System.out.println(a + " + " + b + " = " + (a+b));
        }
        catch (InputMismatchException e){
            System.out.println("Lỗi! Nhập vào một số nguyên " );
        }
        catch (Exception ex){
            System.out.println("Có lỗi xãy ra!" + ex.getMessage());
        }
        finally {
            System.out.println("Chương trình kết thúc");
            scanner.close();
        }



    }
}
