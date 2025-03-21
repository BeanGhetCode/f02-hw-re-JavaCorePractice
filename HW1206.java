package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW1206_NegativeNumberException extends Exception  {
    private int number;

    public HW1206_NegativeNumberException(String message){
        super(message);
    }

    public HW1206_NegativeNumberException(String message, int number){
        super(message);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Lỗi: " + super.getMessage();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        try{
            System.out.println("Nhập vào một số nguyên: ");
            number = scanner.nextInt();

            if(number < 0){
                throw new NumberFormatException("Phải nhập số nguyên đương!");
            }
            System.out.println("Số vừa nhập là: " + number);
        } catch (NumberFormatException e) {
            try {
                throw new HW1206_NegativeNumberException("Phải nhập số nguyên đương!");
            }
            catch (HW1206_NegativeNumberException ex) {
                System.out.println(ex);
            }
        }
        catch (InputMismatchException e){
            System.out.println("Lỗi! Nhập vào một số nguyên ");
        }
        catch (Exception ex){
            System.out.println("Có lỗi xãy ra!" + ex.getMessage());
        }
        finally{
            scanner.close();
            System.out.println("Chương trình kết thúc");
        }
    }
}
