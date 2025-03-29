package Generics;

import java.util.ArrayList;
import java.util.HashSet;

public class HW1401 {
    static <E> ArrayList <E> removeDuplicates (ArrayList<E> list){
        HashSet <E> hashSet = new HashSet<>(list);
        return new ArrayList<>(hashSet);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("A");
        list.add("V");
        list.add("R");
        list.add("asdas");

        System.out.println("Danh sách ban đầu: " + list);
        list = removeDuplicates(list);
        System.out.println("Sau khi loại bỏ trùng lặp: " + list);
    }
}
