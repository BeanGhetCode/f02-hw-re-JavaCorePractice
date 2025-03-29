package DataStructures;

import java.util.HashSet;


public class HW1303 {
    public static void main(String[] args) {
        HashSet<Integer> result = new HashSet<Integer>();
        int[] arr = {1,2,2,3,4,5,4};

        for(int i =0; i< arr.length; i++){
            result.add(arr[i]);
        }
        System.out.print("Có " + result.size() + " số khác nhau: ");

        // Dung StringBuilder loaij bo dau [] khi in ra
        StringBuilder stringBuilder = new StringBuilder();
        for(int num:result){
            stringBuilder.append(num).append(", ");
        }
        // Loai bo ", " o cuoi
        System.out.print(stringBuilder.substring(0,stringBuilder.length()-2));

    }
}
