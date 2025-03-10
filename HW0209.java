package VariableDataTypeIO;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class File04 {
    public static void main(String[] args) {
        File inputFile = new File("src/VariableDataTypeIO/File04.txt");
        File outputFile = new File("src/VariableDataTypeIO/File04output.txt");

        if (!inputFile.exists()) {
            System.out.println("Lỗi: Tệp đầu vào không tồn tại!");
            return;
        }

        try (Scanner scanner = new Scanner(inputFile);
             PrintWriter output = new PrintWriter(outputFile)) {

            // Kiểm tra xem tệp có đủ 3 số nguyên không
            if (!scanner.hasNextInt()) {
                System.out.println("Lỗi: Ngày không hợp lệ!");
                return;
            }
            int day = scanner.nextInt();

            if (!scanner.hasNextInt()) {
                System.out.println("Lỗi: Tháng không hợp lệ!");
                return;
            }
            int month = scanner.nextInt();

            if (!scanner.hasNextInt()) {
                System.out.println("Lỗi: Năm không hợp lệ!");
                return;
            }
            int year = scanner.nextInt();

            // Ghi dữ liệu vào file đầu ra
            output.printf("%02d/%02d/%04d%n", day, month, year);
            System.out.println("Chuyển đổi hoàn tất! Kết quả đã được lưu vào tệp.");


        } catch (Exception e) {
            System.out.println("Lỗi khi xử lý tệp: " + e.getMessage());
        }
    }
}
