public class HW05 {
    public static void swap (int [] arr, int a, int b){
        if (arr == null || arr.length == 0){
            System.out.println("mang khong hop le");
            return;
        }
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void bubbleSort (int [] arr){
        if (arr == null || arr.length == 0){
            System.out.println("mang khong hop le");
            return;
        }
        for(int i = arr.length-1;  i>=0; i--){
            for(int j = 0; j<i; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }
    public static boolean soSanhArr (int [] A, int [] N){
        if (A == null || A.length == 0 ||N == null || N.length == 0){
            System.out.println("Mang khong hop le");
            return false;
        }
        if (A.length != N.length){
            System.out.println("Do dai 2 mang khong bang nhau");
            return false;
        }
        for(int i=0; i<A.length; i++ ){
            if(N[i] < A[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] A = {7, 8, 5};
        int [] N = {6, 12, 10};
        bubbleSort(A);
        bubbleSort(N);
        if (soSanhArr(A,N)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
