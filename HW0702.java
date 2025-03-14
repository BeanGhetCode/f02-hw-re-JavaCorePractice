public class Ex02 {
    public static int findMin(int [] arr, int s, int e){
        if(arr == null || arr.length ==0){
            System.out.println("Mang khong hop le");
            return -1;
        }
        int min = arr[s];
        int idx = s;
        for(int i =s; i<=e; i++){
            if(arr[i]< min){
                min = arr[i];
                idx = i;
            }
        }
        return idx;
    }
    public static void swap (int [] arr, int idx_1, int idx_2){
        int temp = arr[idx_1];
        arr[idx_1] = arr[idx_2];
        arr[idx_2] = temp;
    }
    public static void seletioSort (int [] arr){
        for(int i =0; i< arr.length; i++){
            int idx = findMin(arr, i, arr.length-1);
            swap(arr,i, idx );
        }
    }

    public static int findIndex (int [] arr, int n){
        int low =0;
        int hight = arr.length-1;
        while(low <= hight){
            int mid = (low + hight)/2;
            if(n < arr[mid]){
                hight = mid-1;
            } else if (n > arr[mid]) {
                low = mid +1;
            }
            else{
                return 1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {5,3,7,1,6,3};
        seletioSort(arr);
        System.out.println();
        System.out.println(findIndex(arr, 9));
    }
}
