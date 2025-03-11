import java.util.Scanner;

public class Ex07 {
    public static int giaiThua (int n){
        int result = 1;
        for (int i =1; i<=n; i++){
            result = result * i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can tinh ");
        int n = scanner.nextInt();
        System.out.println(n + " ! = "+giaiThua(n));
        scanner.close();
    }
}
