package Exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HW1209_StudentManager {
    private ArrayList<HW1209_Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent (){
        System.out.println("Nhập họ tên: ");
        String name = scanner.nextLine();

        int id = students.size() +1;
        students.add(new HW1209_Student(id, name));
        System.out.println("Đã thêm sinh viên: " + name);
    }

    public void showStudents () throws HW1209_EmptyListException {
        if(students.isEmpty()){
            throw new HW1209_EmptyListException("Danh sách sinh viên đang rỗng!");
        }

        System.out.println("Danh sách sinh viên: ");
        for(int i =0; i< students.size(); i++){
            System.out.println((i + 1) + ". " + students.get(i));
        }
    }

    public void removeStudent() throws HW1209_EmptyListException {
        try{
            if(students.isEmpty()){
                throw new HW1209_EmptyListException("Danh sách sinh viên đang rỗng! ");
            }
            System.out.println("Nhập MSSV cần xóa: ");
            int idx = scanner.nextInt();
            scanner.nextLine();

            if(idx <=0 || idx > students.size()){
                throw new IndexOutOfBoundsException("MSSV không hợp lệ!");
            }

            HW1209_Student removedStudent = students.remove(idx-1);
            System.out.println("Đã xóa sinh viên: " + removedStudent.getName());
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Lỗi! " + e.getMessage());
        }
        catch (HW1209_EmptyListException e) {
            System.out.println("Lỗi! " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Đã xảy ra lỗi : " + e.getMessage());
        }
    }

    public void menu() {
        while (true) {
            try {
                System.out.println("\n MENU QUẢN LÝ SINH VIÊN");
                System.out.println("1. Thêm sinh viên");
                System.out.println("2. Xóa sinh viên");
                System.out.println("3. Hiển thị danh sách");
                System.out.println("4. Thoát");
                System.out.print("Chọn một tùy chọn: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Đọc dòng thừa sau nextInt()

                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        removeStudent();
                        break;
                    case 3:
                        showStudents();
                        break;
                    case 4:
                        System.out.println(" Thoát chương trình.");
                        return;
                    default:
                        System.out.println(" Lựa chọn không hợp lệ, vui lòng nhập lại!");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Lỗi! Vui lòng nhập một số nguyên.");
                scanner.nextLine();
            }
            catch (HW1209_EmptyListException e) {
                System.out.println("Lỗi! " + e);
            }
        }
    }

    public static void main(String[] args) {
        HW1209_StudentManager manager = new HW1209_StudentManager();
        manager.menu();
    }

}

