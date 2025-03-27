package DataStructures;

import java.util.HashSet;


public class HW1303 {
    public static void main(String[] args) {
        HashSet<Integer> result = new HashSet<Integer>();
        int[] arr = {1,2,3,3,2,4,6,1,8};

        for(int i =0; i< arr.length; i++){
            result.add(arr[i]);
        }
        System.out.println("Các số khác nhau: " + result);

    }
}
