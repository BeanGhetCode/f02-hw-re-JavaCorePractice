package VariableDataTypeIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File03 {
    public static void main(String[] args) {
        File inputFile = new File("src/VariableDataTypeIO/File03.txt");
        File outputFile = new File("src/VariableDataTypeIO/File03output.txt");

        if (!inputFile.exists()) {
            System.out.println("Lỗi: Tệp đầu vào không tồn tại!");
            return;
        }

        try (Scanner scanner = new Scanner(inputFile);
             PrintWriter output = new PrintWriter(outputFile)) {

            if (!scanner.hasNextDouble()) {
                System.out.println("Lỗi: Nội dung tệp không hợp lệ!");
                return;
            }

            double input = scanner.nextDouble();

            // Tính toán thời gian
            int years = (int) (input / 525600);
            int days = (int) ((input % 525600) / 1440);
            int hours = (int) ((input % 1440) / 60);
            double minutes = input % 60;

            // Ghi dữ liệu ra file đầu ra
            output.printf("%.0f phút => %d năm, %d ngày, %d giờ, %.2f phút%n",
                    input, years, days, hours, minutes);

            System.out.println("Dữ liệu đã được ghi vào File03output.txt");


        } catch (Exception e) {
            System.out.println("Lỗi khi xử lý tệp: " + e.getMessage());
        }
    }
}
