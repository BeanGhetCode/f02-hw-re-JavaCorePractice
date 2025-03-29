package Generics;

import java.util.ArrayList;
import java.util.List;

public class HW1404 {
    static double sumNumbers(List< ? extends Number>list){
        double result = 0;
        for(Number num:list){
            result += num.doubleValue();
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
        System.out.println("Tổng các số: " + sumNumbers(list));
    }
}
