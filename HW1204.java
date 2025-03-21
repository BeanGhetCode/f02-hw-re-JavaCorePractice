package Exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HW1204 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int [10];
        int idx;
        while (true){
            try{
                System.out.println("Nhập vào chỉ số của mảng");
                idx = scanner.nextInt();


                if (idx >= arr.length || idx < 0){
                    throw new ArrayIndexOutOfBoundsException("Lỗi! Truy cập chỉ số mảng ngoài phạm vi");
                }

                System.out.println("Nhập giá trị cần gán cho mảng: ");
                arr[idx] = scanner.nextInt();
                System.out.println("Giá trị tại arr[" + idx + "] = " + arr[idx]);
                break;

            }
            catch (InputMismatchException e){
                System.out.println("Lỗi! Nhập vào một số nguyên ");
                scanner.next();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
            catch (Exception ex){
                System.out.println("Có lỗi xãy ra!" + ex.getMessage());
            }
        }
        scanner.close();

    }
}
