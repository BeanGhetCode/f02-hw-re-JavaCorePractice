public class HW02 {
    public static int findMaxIndex (int [] arr, int s, int e){
        if (arr == null || arr.length == 0){
            return -1;
        }
        int max = arr[s];
        int idx = s;
        for (int i=s+1; i<= e; i++){
            if(arr[i]>max){
                max = arr[i];
                idx = i;
            }
        }
        return idx;
    }
    public static int findMinIndex(int [] arr, int s, int e){
        if (arr == null || arr.length == 0){
            return -1;
        }
        int min = arr[s];
        int idx = s;
        for (int i=s+1; i<= e; i++){
            if(arr[i]<min){
                min = arr[i];
                idx = i;
            }
        }
        return idx;
    }
    public static void swap (int[] arr, int index_1, int index_2){
        int temp = arr[index_1];
        arr[index_1] = arr[index_2];
        arr[index_2] = temp;
    }
    public static void main(String[] args) {
        int [] arr = {9, 7, 12, 8, 6, 5,15,4,1,2};
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(i%2 ==0){
                int idxMax = findMaxIndex(arr,i, arr.length-1);
                swap(arr,i,idxMax );
            }
            else {
                int idxMin = findMinIndex(arr,i, arr.length-1);
                swap(arr,i,idxMin );
            }
        }
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}

