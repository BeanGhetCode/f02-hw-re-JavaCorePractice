
import java.util.Scanner;

public class Ex19 {
    public static boolean ktTangGiam(long n){

        long temp=9;
        while (n > 0){

            long a = n%10;
            if (a > temp){
                return false;
            }
            temp = a;
            n = n/10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra: ");
        long n = scanner.nextLong();
        if (!ktTangGiam(n)){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}
