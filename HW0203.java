package VariableDataTypeIO;

import java.util.Scanner;

public class Console03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phút cần chuyển: ");

        if (!scanner.hasNextDouble()) {
            System.out.println("Lỗi: Vui lòng nhập một số hợp lệ!");
            scanner.close();
            return;
        }

        double input = scanner.nextDouble();
        scanner.close();

        int years = (int) (input / 525600);  // 1 năm = 525600 phút
        int days = (int) ((input % 525600) / 1440); // 1 ngày = 1440 phút
        int hours = (int) ((input % 1440) / 60);  // 1 giờ = 60 phút
        double minutes = input % 60; // Lấy phần dư sau khi tính giờ

        System.out.printf("%.0f phút => %d năm, %d ngày, %d giờ, %.2f phút\n",
                input, years, days, hours, minutes);
    }
}
