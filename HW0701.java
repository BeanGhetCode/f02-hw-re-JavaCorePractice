public class Ex01 {
    public static void findTwoMin(int [] arr){
        if (arr == null || arr.length <2){
            System.out.println("Mang khong hop le");
            return;
        }
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i=0; i< arr.length; i++){
            if(arr[i]< min1){
                min2 = min1;
                min1 = arr[i];
            } else if(arr[i]>min1 && arr[i] < min2){
                min2 = arr[i];
            }
        }


        if(min2 == Integer.MAX_VALUE){
            System.out.println("Khong co phan tu nhu thu 2 trong mang");
        }
        else {
            System.out.println("Phan tu nho nhat trong mang: " + min1);
            System.out.println("Phan tu nho thu hai trong mang: " + min2);
        }

    }
    public static void main(String[] args) {
        int [] arr = {1,1,1,1,1,1};
        findTwoMin(arr);
    }
}
