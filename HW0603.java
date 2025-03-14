public class HW03 {
    public static int findMax (int [] arr){
        if (arr == null || arr.length == 0){
            return -1;
        }
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int findMin(int [] arr){
        if (arr == null || arr.length == 0){
            return -1;
        }
        int min = arr[0];

        for (int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static boolean kiemTraTonTai (int [] arr, int n){
        for(int i =0; i< arr.length; i++){
            if(arr[i] == n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {5, 7, 9, 3, 6, 2};
        int min = findMin(arr);
        int max = findMax(arr);
        if (max>100 || min > 100){
            System.out.println("Mang khong hop le.");
        }else{
            String str = "";
            for (int i = min; i<=max; i++){

                if(!kiemTraTonTai(arr,i)){
                    str += i +" ";
                }
            }
            System.out.println("So con thieu trong mang: "+str);
        }

    }
}
