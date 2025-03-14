
import java.util.Scanner;

public class HW02 {
    public static String findIndex (int [] arr, int n){
        String str = "";
        boolean check = false;
        for(int i =0; i<arr.length; i++){
            if (arr[i] == n){
                str += i + " ";
                check = true;
            }
        }
        return check ?str.trim(): "-1";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so can tim trong mang: ");

        int n = input.nextInt();
        int [] arr = HW01.nhapMang();

        System.out.println("Index cua " + n + " trong mang: ");
        System.out.println(findIndex(arr,n));
        input.close();
    }
}
