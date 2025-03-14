import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HW09 {
    // Ham nhap mang tu console
    public static int [] nhapMangConsole (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i<n; i++){
            System.out.printf("Nhap phan tu thu %d: ", i+1);
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    // Ham nhap mang tu file
    public static int [] nhapMangFile (String filePath){
        File input = new File(filePath);
        try(Scanner scanner = new Scanner(input)){
            int n = scanner.nextInt();
            int [] arr = new int[n];
            for (int i =0; i<n; i++){
                arr[i] = scanner.nextInt();
            }
            return arr;
        }
        catch (FileNotFoundException e){
            System.out.println("Khong tim thay file");
        }
        return null;

    }
    // Ham in mang ra console
    public static void inMangConsole (int [] arr){
        for (int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
    // Ham in mang ra file
    public static void inMangFile (int [] arr, String filePath){
        File outputFile = new File(filePath);
        try(PrintWriter output = new PrintWriter(outputFile)){
            output.println(arr.length);
            for (int i =0; i< arr.length; i++){
                output.print(arr[i]+" ");
            }
            System.out.println("Mang da duoc ghi thanh cong");

        }
        catch (Exception e){
            System.out.println("Loi khi xu ly tep");
        }

    }
    // Ham tinh tong mang 1 chieu
    public static int sum (int [] arr){
        int sum =0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    // Ham tim so lon nhat trong mang mot chieu
    public static int findMax (int [] arr){
        if (arr == null || arr.length == 0){
            return Integer.MAX_VALUE;
        }
        int max = arr[0];
        for (int i =1; i<arr.length; i++ ){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
    // Ham tim so nho nhat trong mang mot chieu
    public static int findMin (int [] arr){
        if (arr == null || arr.length == 0){
            return Integer.MAX_VALUE;
        }
        int min = arr[0];
        for (int i =1; i<arr.length; i++ ){
            if(arr[i]< min){
                min = arr[i];
            }
        }
        return min;
    }
    // Ham tim vi tri cua phan tu nho nhat
    public static int findMinIndex (int [] arr){
        if (arr == null || arr.length == 0){
            return -1;
        }
        int min = findMin(arr);
        for (int i =0; i< arr.length; i++){
            if (arr[i] == min){
                return i+1;
            }
        }
        return Integer.MAX_VALUE;
    }
    // Ham tim vi tri cua phan tu lon nhat
    public static int findMaxIndex (int [] arr){
        if (arr == null || arr.length == 0){
            return -1;
        }
        int max = findMax(arr);
        for (int i =0; i< arr.length; i++){
            if (arr[i] == max){
                return i+1;
            }
        }
        return Integer.MAX_VALUE;
    }
    // Ham tim vi tri dau tien co gia tri bang n
    public static int findIndexHead (int [] arr, int n){
        if (arr == null || arr.length == 0){
            return -1;
        }
        for(int i =0; i< arr.length; i++){
            if(arr[i] == n){
                return i+1;
            }
        }
        return -1;
    }
    // Ham tim vi tri cuoi cung cos gia tri bang n
    public static int findIndexLast (int [] arr, int n){
        if (arr == null || arr.length == 0){
            return -1;
        }

        for(int i =arr.length-1; i >= 0; i--){
            if(arr[i] == n){
                return i+1;
            }
        }
        return -1;
    }
    // Hoan doi vi tri 2 phan tu trong mang
    public static int [] swap (int [] arr, int a, int b){
        if (arr == null || arr.length == 0){
            return new int [0];
        }
        if(a > arr.length || b> arr.length){
            return new int []{-1};
        }
        int temp = arr[a-1];
        arr[a-1] = arr[b-1];
        arr[b-1] = temp;
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = "src/Array/HW09.txt";
        int [] arr = nhapMangConsole();
        System.out.println("Mang 1 chieu vua nhap: ");
        inMangConsole(arr);
        inMangFile(arr, filePath);
        int [] arrFile = nhapMangFile(filePath);
        System.out.println("Mang 1 chieu doc tu file: ");
        inMangConsole(arrFile);
        System.out.println("Tong cac phan tu trong mang: " + sum(arr));
        System.out.println("So lon nhat trong mang: " + findMax(arr));
        System.out.println("So nho nhat trong mang: " + findMin(arr));
        System.out.println("Vi tri cua phan tu nho nhat trong mang: " + findMinIndex(arr));
        System.out.println("Vi tri cua phan tu lon nhat trong mang: " + findMaxIndex(arr));
        System.out.println("Nhap phan tu muon tim trong mang: ");
        int n = scanner.nextInt();
        System.out.println("Vi tri cua phan tu dau tien co gia tri bang " + n + " trong mang: " + findIndexHead(arr,n));
        System.out.println("Vi tri cua phan tu cuoi cung co gia tri bang " + n + " trong mang: " + findIndexLast(arr,n));
        System.out.println(" Nhap 2 vi tri muon hoan doi vi tri trong mang: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int [] arrSwap = swap(arr, a,b);
        System.out.println("Mang sau khi hoan doi: ");
        inMangConsole(arrSwap);
        scanner.close();

    }
}
