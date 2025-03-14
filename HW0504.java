import java.io.*;
import java.util.Scanner;

public class HW04 {
    public static int [][][] nhapMang3D (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong lop ");
        int depth = scanner.nextInt();
        System.out.println("Nhap so luong hang: ");
        int rows = scanner.nextInt();
        System.out.println("Nhap so luong cot: ");
        int cols = scanner.nextInt();
        int [][][] arr3D = new int [depth][rows][cols];
        for (int d =0; d< depth; d++){
            for (int i =0; i< rows; i++){
                for (int j =0; j< cols; j++){
                    System.out.printf("Nhap phan tu thu [%d] [%d] [%d]:  ",d,i,j);
                    arr3D[d][i][j] = scanner.nextInt();
                }
            }
        }
        return arr3D;
    }
    public static void inMang3D(int [][][] arr3D){
        File outputFile = new File("src/Array/outputArray3D.txt");
        try (PrintWriter output = new PrintWriter(outputFile)){
            output.println("Mang 3D:");
            for (int d =0; d< arr3D.length; d++){
                output.println("Lop "+d+": ");
                for (int i =0; i< arr3D[d].length; i++){
                    for (int j= 0; j<arr3D[d][i].length; j++){
                        output.print(arr3D[d][i][j]+ " ");
                    }
                    output.println();
                }
            }
            System.out.println("Chuyển đổi hoàn tất! Kết quả đã được lưu vào tệp.");

        }
        catch (IOException e){
            System.out.println("Loi ghi file: " +e.getMessage());
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        int [][][] arr3D = nhapMang3D();
        inMang3D(arr3D);


    }
}
