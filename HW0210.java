package VariableDataTypeIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File05 {
    public static void main(String[] args) {
        File inputFile = new File("src/VariableDataTypeIO/File05.txt"); // Đổi lại tên file chính xác
        File outputFile = new File("src/VariableDataTypeIO/File05output.txt");

        if (!inputFile.exists()) {
            System.out.println("Lỗi: Tệp đầu vào không tồn tại!");
            return;
        }

        try (Scanner scanner = new Scanner(inputFile);
             PrintWriter output = new PrintWriter(outputFile)) {

            // Kiểm tra dữ liệu hợp lệ trước khi đọc
            if (!scanner.hasNextLine()) {
                System.out.println("Lỗi: Không có tên trong tệp!");
                return;
            }
            String name = scanner.nextLine();

            if (!scanner.hasNextInt()) {
                System.out.println("Lỗi: Tuổi không hợp lệ!");
                return;
            }
            int age = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng trống sau số nguyên

            if (!scanner.hasNextLine()) {
                System.out.println("Lỗi: Chiều cao không hợp lệ!");
                return;
            }
            String height = scanner.nextLine();

            // Xuất kết quả ra file đầu ra
            output.println("Họ và tên: " + name);
            output.println("Tuổi: " + age);
            output.println("Chiều cao: " + height);

            System.out.println("Chuyển đổi hoàn tất! Kết quả đã được lưu vào tệp.");

        } catch (Exception e) {
            System.out.println("Lỗi khi xử lý tệp: " + e.getMessage());
        }
    }
}
