package VariableDataTypeIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File01 {
    public static void main(String[] args) {
        File inputFile = new File("src/VariableDataTypeIO/File01.txt");
        File outputFile = new File("src/VariableDataTypeIO/File01output.txt");

        if (!inputFile.exists()) {
            System.out.println("Lỗi: Tệp đầu vào không tồn tại!");
            return;
        }
        // Sử dụng try-with-resources để tự động đóng Scanner và PrintWriter
        try (Scanner scanner = new Scanner(inputFile);
             PrintWriter output = new PrintWriter(outputFile)) {

            if (!scanner.hasNextDouble()) {
                System.out.println("Lỗi: Dữ liệu không hợp lệ trong tệp!");
                return;
            }

            double number = scanner.nextDouble();
            double result = number * 2.54;

            output.printf("%.2f inch = %.2f cm%n", number, result);
            System.out.println("Chuyển đổi hoàn tất! Kết quả đã được lưu vào tệp.");

        } catch (Exception e) {
            System.out.println("Lỗi khi xử lý tệp: " + e.getMessage());
        }
    }
}
