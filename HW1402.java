package Generics;

import java.util.Arrays;

public class HW1402 {
    static <T> void swap (T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Integer [] arr = {1,3,2,4,6,5,3};

        System.out.println("Mang chua swap: " + Arrays.toString(arr));
        swap(arr, 2,3);
        System.out.println("Mang sau khi hoan doi : " + Arrays.toString(arr));
    }
}
