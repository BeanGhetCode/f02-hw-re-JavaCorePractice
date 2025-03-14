import java.util.Scanner;

public class HW03 {
    public static int [][] nhapMang2D (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng hàng: ");
        int rows = scanner.nextInt();
        System.out.println("Nhập số lượng cột: ");
        int cols = scanner.nextInt();
        int arr[][] = new int [rows][cols];
        for(int i =0; i< rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.println("Nhâp phần tử ["+(i+1)+"] ["+(j+1)+"]");
                arr[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        return arr;
    }
    public static int findMax2D (int [][]arr){
        int max = arr[0][0];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j< arr[i].length; j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[][] = nhapMang2D();

        System.out.println("Phần tử lớn nhất trong mảng: "+findMax2D(arr));


    }
}
