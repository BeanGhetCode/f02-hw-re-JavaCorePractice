package DataStructures;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


// Lớp Student để lưu trữ thông tin sinh viên
public class Student {
    private int MSSV;
    private String fullName;
    private int age;
    private double GPA;

    public Student (){

    }

    public Student(int MSSV, String fullName, int age, double GPA) {
        this.MSSV = MSSV;
        this.fullName = fullName;
        this.age = age;
        this.GPA = GPA;
    }

    public int getMSSV() {
        return MSSV;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public double getGPA() {
        return GPA;
    }

    public void setMSSV(int MSSV) {
        this.MSSV = MSSV;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return MSSV +", "+ fullName + ", " + age +", "+ GPA;
    }
}

// Lớp StudentManager để quản lý danh sách sinh viên
class StudentManager {
    public ArrayList<Student> readFile(String path) {
        File file = new File(path);
        ArrayList<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;  // Bỏ qua dòng trống
                String[] data = line.split(",");
                if (data.length == 4) {
                    int MSSV = Integer.parseInt(data[0].trim());
                    String fullName = data[1].trim();
                    int age = Integer.parseInt(data[2].trim());
                    double GPA = Double.parseDouble(data[3].trim());

                    students.add(new Student(MSSV, fullName, age, GPA));
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
        return students;
    }


    public void addStudent(ArrayList<Student> students, String path) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);

        student.setMSSV(students.isEmpty() ? 1 : students.get(students.size() - 1).getMSSV() + 1);

        System.out.println("Nhập Họ và Tên sinh viên: ");
        student.setFullName(scanner.nextLine());

        // Kiểm tra nhập tuổi (phải là số nguyên dương)
        while (true) {
            System.out.println("Nhập tuổi: ");
            try {
                int age = scanner.nextInt();
                if (age > 0) {
                    student.setAge(age);
                    break;
                } else {
                    System.out.println("Tuổi phải là số nguyên dương! Vui lòng nhập lại.");
                }
            } catch (Exception e) {
                System.out.println("Lỗi: Tuổi phải là số nguyên! Vui lòng nhập lại.");
                scanner.nextLine(); // Xóa bộ nhớ đệm để tránh vòng lặp vô hạn
            }
        }

        // Kiểm tra nhập GPA (phải là số thực từ 0.0 đến 4.0)
        while (true) {
            System.out.println("Nhập GPA: ");
            try {
                double gpa = scanner.nextDouble();
                if (gpa >= 0.0 && gpa <= 4.0) {
                    student.setGPA(gpa);
                    break;
                } else {
                    System.out.println("GPA phải trong khoảng 0.0 - 4.0! Vui lòng nhập lại.");
                }
            } catch (Exception e) {
                System.out.println("Lỗi: GPA phải là số thực! Vui lòng nhập lại.");
                scanner.nextLine();
            }
        }


        students.add(student);
        try (PrintWriter output = new PrintWriter(new FileWriter(path, true))) {
            output.println(student);
            System.out.println("Đã thêm sinh viên vào file!");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }

    public void editStudent(ArrayList<Student> students, String path) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập MSSV muốn sửa: ");
        int idx = scanner.nextInt();
        boolean check = false;

        for (Student student : students) {
            if (student.getMSSV() == idx) {
                check = true;
                System.out.println("Sinh viên hiện tại: " + student);

                System.out.print("Nhập Họ và Tên mới: ");
                scanner.nextLine();
                student.setFullName(scanner.nextLine());

                System.out.print("Nhập tuổi mới: ");
                student.setAge(scanner.nextInt());

                System.out.print("Nhập GPA mới: ");
                student.setGPA(scanner.nextDouble());

                System.out.println("Cập nhật thành công!");
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy sinh viên có MSSV: " + idx);
            return;
        }

        try (PrintWriter output = new PrintWriter(new FileWriter(path))) {
            for (Student student : students) {
                output.println(student);
            }
            System.out.println("Danh sách đã được cập nhật vào file.");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }

    public void deleteStudent(ArrayList<Student> students, String path) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập MSSV muốn xoa: ");
        int idx = scanner.nextInt();
        boolean check = false;

        for (Student student : students) {
            if (student.getMSSV() == idx) {
                check = true;

                students.remove(idx - 1);

                System.out.println("Xoa thành công!");
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy sinh viên có MSSV: " + idx);
            return;
        }

        try (PrintWriter output = new PrintWriter(new FileWriter(path))) {
            for (Student student : students) {
                output.println(student);
            }
            System.out.println("Danh sách đã được cập nhật vào file.");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }

    public void showStudents(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
        } else {
            System.out.println("Danh sách sinh viên:");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    public String getLastName(Student student) {
        String[] name = student.getFullName().split(" ");
        return name[name.length - 1];
    }

    public void sortByName(ArrayList<Student> students) {
        students.sort(Comparator.comparing(this::getLastName));
        System.out.println("Sắp xếp thành công!");
    }

    public void sortByGPAAscending (ArrayList<Student> students){
        students.sort(Comparator.comparing(Student::getGPA));
        System.out.println("Sắp xếp thành công!");
    }

    public void sortByGPADescending (ArrayList<Student> students){
        students.sort(Comparator.comparing(Student::getGPA).reversed());
        System.out.println("Sắp xếp thành công!");
    }

    public void searchStudent (ArrayList<Student> students, int id){
        boolean check = false;
        for(Student student : students){
            if(student.getMSSV() == id){
                System.out.println(student);
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("Không tìm thấy sinh viên có MSSV: " + id);
        }
    }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = "src/DataStructures/students.txt";
        StudentManager manager = new StudentManager();
        ArrayList<Student> students = manager.readFile(path);

        int choice;
        do {
            System.out.println("==================================");
            System.out.println("      QUẢN LÝ SINH VIÊN - MENU    ");
            System.out.println("==================================");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Hiển thị danh sách sinh viên");
            System.out.println("5. Sắp xếp danh sách");
            System.out.println("   5.1. Theo họ tên (A -> Z)");
            System.out.println("   5.2. Theo điểm trung bình (Tăng dần)");
            System.out.println("   5.3. Theo điểm trung bình (Giảm dần)");
            System.out.println("6. Tìm kiếm sinh viên");
            System.out.println("7. Thoát chương trình");
            System.out.println("==================================");
            System.out.print("Nhập lựa chọn của bạn: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    manager.addStudent(students, path);
                    break;
                case 2:
                    manager.editStudent(students, path);
                    break;
                case 3:
                    manager.deleteStudent(students, path);
                    break;
                case 4:
                    manager.showStudents(students);
                    break;
                case 5:
                    System.out.println("Chọn kiểu sắp xếp:");
                    System.out.println("1. Theo họ tên (A -> Z)");
                    System.out.println("2. Theo điểm trung bình (Tăng dần)");
                    System.out.println("3. Theo điểm trung bình (Giảm dần)");
                    System.out.print("Nhập lựa chọn: ");
                    int sortChoice = scanner.nextInt();
                    if (sortChoice == 1) {
                        manager.sortByName(students);
                        manager.showStudents(students);
                    } else if (sortChoice == 2) {
                        manager.sortByGPAAscending(students);
                        manager.showStudents(students);
                    } else if (sortChoice == 3) {
                        manager.sortByGPADescending(students);
                        manager.showStudents(students);
                    } else {
                        System.out.println("Lựa chọn không hợp lệ!");
                    }
                    break;
                case 6:
                    System.out.print("Nhập MSSV cần tìm: ");
                    int searchMSSV = scanner.nextInt();
                    manager.searchStudent(students, searchMSSV);
                    break;
                case 7:
                    System.out.println("Thoát chương trình...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại.");
            }
        } while (choice != 7);

        scanner.close();
    }
}
