package Exception;

import java.util.Scanner;

public class HW1201 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            int a,b;
            System.out.println("Nhập số nguyên thứ nhất: ");
            while(!scanner.hasNextInt()){
                System.out.println("Nhập vào một số nguyên.");
                scanner.next();
            }
            a = scanner.nextInt();

            System.out.println("Nhập số nguyên thứ hai: ");
            while(!scanner.hasNextInt()){
                System.out.println("Nhập vào một số nguyên.");
                scanner.next();
            }
            b = scanner.nextInt();

            if(b == 0){
                throw new ArithmeticException("Không thể chia cho 0!");
            }

            System.out.println(a + "/" + b + " = " + ((double)a/b));
        }
        catch (ArithmeticException ex){
            System.out.println("Lỗi! " + ex.getMessage());
        }
        catch (Exception ex){
            System.out.println("Có lỗi xãy ra!" + ex.getMessage());
        }

    }


}
