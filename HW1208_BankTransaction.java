package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW1208_BankTransaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HW1208_BankAccount account = new HW1208_BankAccount(10000000);

        while (true){
            try{
                System.out.println("Nhập số tiền muốn rút: ");
                double amount = scanner.nextDouble();
                account.fundout(amount);

                break;
            }
            catch (HW1208_InvalidAmountException e){
                System.out.println(e);
            }
            catch(HW1208_InsufficientFundsException e){
                System.out.println(e);
            }
            catch (InputMismatchException e){
                System.out.println("Số tiền nhập vào không hợp lê");
                scanner.next();
            }
            catch (Exception ex){
                System.out.println("Có lỗi xãy ra!" + ex.getMessage());
            }
        }
        scanner.close();
        System.out.println("Giao dịch thành công!");
    }
}
