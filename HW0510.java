import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HW10 {
    public static int [][] nhapmang2DConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dong: ");
        int rows = scanner.nextInt();
        System.out.println("Nhap so cot");
        int cols = scanner.nextInt();
        int [][] arr2D = new int [rows][cols];
        for (int i =0; i< rows; i++){
            for (int j =0; j< cols; j++){
                System.out.printf("Nhap phan tu thu [%d][%d]", i+1,j+1);
                arr2D[i][j] = scanner.nextInt();
                System.out.println("");
            }
        }
        return arr2D;
    }
    public static int [][] nhapMang2DFile(String filePath){
        File inputFile = new File(filePath);
        try(Scanner scanner = new Scanner(inputFile)){
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();
            int [][] arr2D = new int [rows][cols];
            for (int i =0; i< rows; i++){
                for( int j = 0; j< cols; j++){
                    arr2D[i][j] = scanner.nextInt();
                }
            }
            return arr2D;
        }
        catch (FileNotFoundException e){
            System.out.println("Khong tim thay file");
        }
        return null;
    }
    public static void inMang2DConsole (int [][]arr2D){
        if (arr2D == null || arr2D.length == 0){
            System.out.println("Mang dau vao khong hop le");
        }
        for(int i =0; i< arr2D.length; i++){
            for (int j =0; j<arr2D[i].length; j++){
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void inMang2DFile (int [][] arr2D, String filePath) {
        File outputFile = new File(filePath);
        try (PrintWriter output = new PrintWriter(outputFile)) {
            output.println(arr2D.length);
            output.println(arr2D[0].length);
            for (int i = 0; i < arr2D.length; i++) {
                for (int j = 0; j < arr2D[i].length; j++) {
                    output.print(arr2D[i][j] + " ");
                }
                output.print("\n");
            }
            System.out.println("Mang da duoc ghi thanh cong");
        }
        catch (Exception e) {
            System.out.println("Loi khi xu ly tep");
        }
    }
    public static int sum2D (int [][] arr2D){
        if(arr2D ==null || arr2D.length == 0){
            return Integer.MAX_VALUE;
        }
        int sum =0;
        for (int i=0; i< arr2D.length; i++){
            for(int j=0; j< arr2D[i].length; j++){
                sum += arr2D[i][j];
            }
        }
        return sum;
    }
    public static int findMax2D (int [][] arr2D){
        if(arr2D ==null || arr2D.length == 0){
            return Integer.MAX_VALUE;
        }
        int max =arr2D[0][0];
        for (int i=0; i< arr2D.length; i++){
            for(int j=0; j< arr2D[i].length; j++){
                if (arr2D[i][j]>max){
                    max = arr2D[i][j];
                }
            }
        }
        return max;
    }
    public static int findMin2D (int [][] arr2D){
        if(arr2D ==null || arr2D.length == 0){
            return Integer.MAX_VALUE;
        }
        int min =arr2D[0][0];
        for (int i=0; i< arr2D.length; i++){
            for(int j=0; j< arr2D[i].length; j++){
                if (arr2D[i][j]<min){
                    min = arr2D[i][j];
                }
            }
        }
        return min;
    }
    public static int[] findMin2DIndex (int [][] arr2D){
        if(arr2D ==null || arr2D.length == 0){
            return new int []{-1,-1};
        }
        int min = findMin2D(arr2D);
        for (int i=0; i< arr2D.length; i++){
            for(int j=0; j< arr2D[i].length; j++){
                if (arr2D[i][j] == min){
                    return new int []{i,j};
                }
            }
        }
        return new int []{-1,-1};
    }
    public static int[] findMax2DIndex (int [][] arr2D){
        if(arr2D ==null || arr2D.length == 0){
            return new int []{-1,-1};
        }
        int max = findMax2D(arr2D);
        for (int i=0; i< arr2D.length; i++){
            for(int j=0; j< arr2D[i].length; j++){
                if (arr2D[i][j] == max){
                    return new int []{i,j};
                }
            }
        }
        return new int []{-1,-1};
    }
    public static int [] findIndexHead (int [][] arr2D, int n){
        if(arr2D ==null || arr2D.length == 0){
            return new int []{-1,-1};
        }
        for(int i =0; i< arr2D.length; i++){
            for(int j =0; j< arr2D[i].length; j++){
                if (arr2D[i][j] == n){
                    return new int [] {i,j};
                }
            }
        }
        return new int []{-1,-1};
    }

    public static int [] findIndexLast (int [][] arr2D, int n){
        if(arr2D ==null || arr2D.length == 0){
            return new int []{-1,-1};
        }
        for(int i = arr2D.length-1; i>=0 ; i--){
            for(int j = arr2D[i].length -1; j >= 0; j--){
                if (arr2D[i][j] == n){
                    return new int [] {i,j};
                }
            }
        }
        return new int []{-1,-1};
    }

    public static int [][] swap2D (int [][] arr2D, int [] index_1, int [] index_2){
        if(arr2D == null || arr2D.length ==0 ){
            return new int [0][0];
        }
        if(index_1[0] >= arr2D.length || index_1[1] >= arr2D[0].length || index_2[0] >= arr2D.length || index_2[1]>= arr2D.length){
            return arr2D;
        }
        int temp = arr2D[index_1[0]-1][index_1[1]-1];
        arr2D[index_1[0]-1][index_1[1]-1] = arr2D[index_2[0]-1][index_2[1]-1];
        arr2D[index_2[0]-1][index_2[1]-1] = temp;
        return arr2D;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "src/Array/HW10.txt";

        // Nhap mang tu console
        int [][] arr2D = nhapmang2DConsole();
        System.out.println("Mang 2 chieu vua nhap: ");

        // In mang vua nhap
        inMang2DConsole(arr2D);

        // Luu mang vua nhap vao file
        inMang2DFile(arr2D, fileName);

        // In ra mang trong file
        int [][] arr2DFile = nhapMang2DFile(fileName);
        System.out.println("Mang 2 chieu doc tu file: ");
        inMang2DConsole(arr2DFile);
        // Tong cac phan tu trong mang
        System.out.println("Tong cac phan tu trong mang: " + sum2D(arr2D));

        // So lon nhat trong mang
        System.out.println("So lon nhat trong mang: " + findMax2D(arr2DFile));

        // So nho nhat trong mang
        System.out.println("So nho nhat trong mang: " + findMin2D(arr2DFile));

        // Vi tri phan tu nho nhat
        System.out.println("Vi tri cua phan tu nho nhat trong mang: " );
        HW09.inMangConsole(findMin2DIndex(arr2D));

        // Vi tri phan tu lon nhat
        System.out.println("Vi tri cua phan tu lon nhat trong mang: " );
        HW09.inMangConsole(findMax2DIndex(arr2D));

        // Tim phan tu trong mang
        System.out.println("Nhap phan tu muon tim trong mang: ");
        int n = scanner.nextInt();
        System.out.println("Vi tri cua phan tu dau tien co gia tri bang " + n + " trong mang: ");
        HW09.inMangConsole(findIndexHead(arr2D,n));
        System.out.println("Vi tri cua phan tu cuoi cung co gia tri bang " + n + " trong mang: ");
        HW09.inMangConsole(findIndexLast(arr2D,n));

        // Hoan doi 2 phan tu trong mang
        System.out.println(" Nhap 2 vi tri muon hoan doi vi tri trong mang: ");

        int [] a = new int [2];
        int [] b = new int [2];
        System.out.println("Nhap so dong vi tri thu nhat: ");
        a[0] = scanner.nextInt();
        System.out.println("Nhap so cot vi tri thu nhat: ");
        a[1] = scanner.nextInt();
        System.out.println("Nhap so dong vi tri thu hai: ");
        b[0] = scanner.nextInt();
        System.out.println("Nhap so cot vi tri thu hai: ");
        b[1] = scanner.nextInt();
        
        int [][] arrSwap = swap2D(arr2D, a,b);
        System.out.println("Mang sau khi hoan doi: ");
        inMang2DConsole(arrSwap);
        scanner.close();

    }
}
