
import java.util.Scanner;

public class Ex17 {
    public static void phanTichNguyenTo (int n){
        if (n < 2){
            System.out.println("n phai >=2");
            return;
        }
        boolean check = true;
        int count = 0;
        while (n%2 ==0){
            count ++;
            n /=2;
        }
        if (count >0){
            System.out.print("2^" + count);
            check = false;
        }
        for(int i =3; i<=7; i+=2){
            count =0;
            while(n%i == 0){
                count ++;
                n /=i;
            }
            if(count >0){
                if(!check){
                    System.out.print(" x ");
                }
                System.out.print(i + "^" + count);
                check = false;
            }
        }
        if (n > 1) {
            if (!check) System.out.print(" x ");
            System.out.print(n + "^1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương cần phân tích: ");
        int n = scanner.nextInt();
        scanner.close();
        phanTichNguyenTo(n);
    }
}
