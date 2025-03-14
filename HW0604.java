public class HW04 {
    public static void insertionSort (int []arr){
        if (arr == null || arr.length == 0){
            System.out.println("mang khong hop le");
            return;
        }
        for(int i =1; i< arr.length; i++){
            int current = arr[i];
            int j;
            for(j = i-1; j>=0; j--){
                if (current < arr[j]){
                    arr[j + 1] = arr[j];
                }
                else {
                    break;
                }
            }
            arr[j+1] = current;
        }
    }


    public static void main(String[] args) {
        int [] arr = {8, 4, 5, 2, 10};
        insertionSort(arr);
        int k=2;
        int [] arrMin = new int [k];
        int [] arrMax = new int [arr.length-k];

        System.out.println("Mang K: ");
        for (int i=0; i<k; i++){
            arrMin[i] = arr[i];
            System.out.print(arrMin[i] + " ");
        }
        System.out.println();
        System.out.println("Mang N-K: ");
        int index = 0;
        for (int i = k; i < arr.length; i++) {
            arrMax[index] = arr[i];
            System.out.print(arrMax[index] + " ");
            index++;
        }



    }
}
