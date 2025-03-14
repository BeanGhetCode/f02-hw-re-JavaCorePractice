package Algorithm_Sorting;
import java.util.ArrayList;

public class HW01 {
    // Dem so lan xuat hien cua phan tu trong mang
    public static int demSoLanXuatHien (int n, int[]arr){
        int count =0;
        for(int i =0; i<arr.length; i++){
            if (arr[i] == n){
                count ++;
            }
        }
        return count;
    }


    public static int[][] soLanXuatHien(int [] arr){
        // Luu cac phan tu xuat hien trong mang vao ArrayList
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i =0; i< arr.length; i++){
            if(!arrayList.contains(arr[i])){
                arrayList.add(arr[i]);
            }
        }

        // Luu phan tu va so lan xuat hien vao mang 2 chieu
        // Cot [0] la phan tu trong mang
        // Cot [1] la so lan xuat hien cua phan tu trong mang
        int [][] result = new int [arrayList.size()][2];
        for (int i = 0; i < arrayList.size(); i++) {
            int num = arrayList.get(i);
            result[i][0] = num;
            result[i][1] = demSoLanXuatHien(num, arr);
        }
        // Xap xet theo so lan xuat hien giam dan
        result =  sort(result);

        // Kiểm tra cac phan tu co so lan xuat hien ban nhau.
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i][1] == result[j][1] && findIndex(arr, result[i][0]) > findIndex(arr, result[j][0])) {
                    swap(result, i, j);
                }
            }
        }
        return result;

    }
    // Tim vi tri lon nhat trong mang
    public static int findIndexMax(int[][] arr, int s, int e) {
        int max = arr[s][1]; // Dong s cot 1
        int idx = s;
        for (int i = s + 1; i <= e; i++) { // Duyệt từ `s+1` đến `e`
            if (arr[i][1] > max) {
                max = arr[i][1];
                idx = i;
            }
        }
        return idx;
    }

    // Sort theo so lan xuat hien cua phan tu trong mang
    public static int [][] sort (int [][] arr2D){
        for(int i=0; i<arr2D.length; i++){
            int idxMax = findIndexMax(arr2D, i, arr2D.length - 1);
            swap(arr2D, i, idxMax);
        }
        return arr2D;
    }

    // Hoan doi vi tri
    public static void swap (int [][] arr2D, int i, int j){
        int temp_1 = arr2D[i][0];
        int temp_2 = arr2D[i][1];
        arr2D[i][0] = arr2D[j][0];
        arr2D[i][1] = arr2D[j][1];
        arr2D[j][0] = temp_1;
        arr2D[j][1] = temp_2;
    }

    // Tim vi tri cua phan tu trong mang
    public static int findIndex (int [] arr, int n){
        for(int i=0; i< arr.length; i++){
            if(arr[i] == n){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr = {2, 5, 2, 8, 5, 6, 8, 8};
        int [][] arr2D = soLanXuatHien(arr);

        for(int i =0; i< arr2D.length;i++){
            for(int j=0; j < arr2D[i][1]; j++){
                System.out.print(arr2D[i][0]+ " ");
            }
        }

    }

}
