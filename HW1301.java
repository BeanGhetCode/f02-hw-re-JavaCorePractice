package DataStructures;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HW1301 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        while(true){
            try{
                System.out.println("\n Menu Quản Lý Tập Hợp Các Số ");
                System.out.println("1. Thêm số.");
                System.out.println("2. Sửa số. ");
                System.out.println("3. Xóa só.");
                System.out.println("4. Xem tập hợp các số.");
                System.out.println("5. Thoát.");
                System.out.println("Chọn một tùy chọn.");

                int choise = scanner.nextInt();
                scanner.nextLine();

                switch (choise){
                    case 1:
                        System.out.println("Nhập số cần thêm vào");
                        int n = scanner.nextInt();
                        nums.add(n);
                        break;
                    case 2:
                        if(nums.isEmpty()){
                            System.out.println("Danh sách rỗng!");
                            break;
                        }
                        else{
                            System.out.println("Nhập ví trí số cần sửa: ");
                            int idx = scanner.nextInt();
                            if(idx <=0 ||idx > nums.size()){
                                throw new IndexOutOfBoundsException("Vị trí không hợp lê!");
                            }
                            System.out.println("Nhập số muốn sửa: ");
                            int num = scanner.nextInt();
                            nums.set(idx-1, num);

                            System.out.println("Sửa thành công!");
                            break;
                        }
                    case 3:
                        if(nums.isEmpty()){
                            System.out.println("Danh sách rỗng!");
                            break;
                        }
                        else {
                            System.out.println("Nhập ví trí số cần xóa: ");
                            int idx = scanner.nextInt();
                            if (idx <= 0 || idx > nums.size()) {
                                throw new IndexOutOfBoundsException("Vị trí không hợp lê!");
                            }
                            nums.remove(idx-1);
                            System.out.println("Xóa thành công!");
                            break;
                        }
                    case 4:
                        if(nums.isEmpty()){
                            System.out.println("Danh sách rỗng!");
                            break;
                        }
                        System.out.println("Tập hợp các số: " +nums);
                        break;
                    case 5:
                        System.out.println(" Thoát chương trình.");
                        return;
                    default:
                        System.out.println(" Lựa chọn không hợp lệ, vui lòng nhập lại!");

                }

            }
            catch(InputMismatchException e) {
                System.out.println("Lỗi! Vui lòng nhập một số nguyên.");
                scanner.nextLine();
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println("Lỗi! " + e.getMessage());
            }
            catch (Exception e) {
                System.out.println("Đã xảy ra lỗi : " + e.getMessage());
            }

        }

    }


}
