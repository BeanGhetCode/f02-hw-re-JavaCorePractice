package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW1205_InvalidAgeException extends Exception {
    private int age;

    public HW1205_InvalidAgeException(String message){
        super(message);
    }

    public HW1205_InvalidAgeException(String message, int age){
        super(message);
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Lỗi: " + super.getMessage();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        try{
            System.out.println("Nhập tuổi: ");
            age = scanner.nextInt();
            if(age < 6){
                throw new HW1205_InvalidAgeException("Tuổi không hợp lệ!");
            }
            System.out.println("Tuổi vừa nhập là: " + age);
        }
        catch(InputMismatchException e){
            System.out.println("Lỗi! Nhập vào một số nguyên ");
        }
        catch(HW1205_InvalidAgeException e){
            System.out.println(e);
        } catch (Exception ex){
            System.out.println("Có lỗi xãy ra!" + ex.getMessage());
        }
        finally{
            scanner.close();
            System.out.println("Chương trình kết thúc");
        }

    }
}
