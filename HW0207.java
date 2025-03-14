package VariableDataTypeIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File02 {
    public static void main(String[] args) {
        File inputFile = new File("src/VariableDataTypeIO/File02.txt");
        File outputFile = new File("src/VariableDataTypeIO/File02output.txt");

        if (!inputFile.exists()) {
            System.out.println("Lỗi: Tệp đầu vào không tồn tại!");
            return;
        }

        // Sử dụng try-with-resources để tự động đóng Scanner và PrintWriter
        try (Scanner scanner = new Scanner(inputFile);
             PrintWriter output = new PrintWriter(outputFile)) {

            // Kiểm tra dữ liệu đầu vào
            if (!scanner.hasNextDouble()) {
                System.out.println("Lỗi: Thiếu giá trị độ F trong tệp!");
                return;
            }
            double F = scanner.nextDouble();

            if (!scanner.hasNextDouble()) {
                System.out.println("Lỗi: Thiếu giá trị độ C trong tệp!");
                return;
            }
            double C = scanner.nextDouble();

            // Chuyển đổi nhiệt độ
            double celsius = (F - 32) * (5.0 / 9);
            double fahrenheit = (C * (9.0 / 5)) + 32;

            // Ghi kết quả vào tệp đầu ra
            output.printf("%.2f F = %.2f C%n", F, celsius);
            output.printf("%.2f C = %.2f F%n", C, fahrenheit);

            System.out.println("Chuyển đổi hoàn tất! Kết quả đã được lưu vào tệp.");

        } catch (Exception e) {
            System.out.println("Lỗi khi xử lý tệp: " + e.getMessage());
        }
    }
}
