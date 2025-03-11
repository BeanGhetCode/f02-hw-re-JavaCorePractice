package LoopFunction;

public class Ex02 {
    public static void main(String[] args) {
        double hocPhi = 10000;  // Dùng double để tránh lỗi làm tròn số
        double sum = 0;

        for (int i = 1; i <= 14; i++) {
            hocPhi += hocPhi * 5 / 100; // Tăng 5% mỗi năm

            if (i <= 10) {
                System.out.printf("Học phí năm %d: %.2f\n", i, hocPhi);
            } else {
                sum += hocPhi; // Cộng dồn học phí của 4 năm cuối
            }
        }

        System.out.printf("Tổng chi phí 4 năm học từ năm thứ 11: %.2f\n", sum);
    }
}
