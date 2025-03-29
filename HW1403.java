package Generics;

import java.util.ArrayList;
import java.util.List;

public class HW1403 {
    static <T> int countOccurrences(List<T> list, T element){
        int result = 0;
        for(int i =0; i<list.size(); i++){
            if(list.get(i) == element){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(1);
        list.add(9);
        System.out.println("Số lần xuất hiện phần tử trong mảng: " + countOccurrences(list, 3));
    }
}
