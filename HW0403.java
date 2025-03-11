import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        String tenMax = "";
        int diemMax = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        if (n < 2) {
            System.out.println("So luong sinh vien phai lon hon hoac bang 2");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println("Nhap ten cua sinh vien thu " + (i + 1) + ": ");
                String ten = scanner.nextLine();

                System.out.println("Nhap diem cua sinh vien thu " + (i + 1) + ": ");
                int diem = scanner.nextInt();
                scanner.nextLine();

                if (diem > diemMax) {
                    diemMax = diem;
                    tenMax = ten;
                }
            }
            System.out.println("Sinh vien co diem cao nhat: " + tenMax + " " + diemMax);
        }

        scanner.close();
    }
}
