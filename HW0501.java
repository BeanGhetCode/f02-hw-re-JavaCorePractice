
import java.util.Scanner;

public class HW01 {
    public static int[] nhapMang (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i =0; i<n; i++){
            System.out.println("Nhập phần tử thứ " + (i+1) + "; ");
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        return arr;
    }
    public static int sumArr (int[] arr){
        int sum =0;
        for(int i =0; i< arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int []arr = nhapMang();
        System.out.println("Tổng mảng vừa nhập: " + sumArr(arr));
    }
}
