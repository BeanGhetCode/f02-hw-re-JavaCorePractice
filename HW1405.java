package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HW1405 {

    //Generic Interface
    interface Identifiable <ID>{
        ID getId();
    }

    //Class student có thể nhận điểm hệ số hoặc điểm hệ chữ, implement ID tu Identifiable
    class Student <T> implements Identifiable{
        private String id;
        private String name;
        private T grate;

        public Student(String id,String name, T grate){
            this.id = id;
            this.name = name;
            this.grate = grate;
        }

        @Override
        public String getId() {
            return this.id;
        }
        @Override
        public String toString(){
            return "ID:" + id + "Student: " + name + " Grate: " + grate;
        }

    }
    // In ra mot mang bat ky dung Generic
    public static <T> void print (T[] arr){
        for(T element : arr){
            System.out.println(element);
        }
    }
    // In ra mot mang bat ky dung Unbouded Wildcard
    public static void printList (List<?> list){
        for (Object obj:list){
            System.out.println(obj);
        }
    }

    // In ra mot mang bat ky dung Bouded Wildcard
    public static void printNum (List<? extends Number> list){
        for (Number num:list){
            System.out.println(num);
        }
    }

    //Tinh tong cac phan tu trong list dung Lower Bounded Wildcard
    public static void sum(List<? super Integer> list){
        double sum =0;
        for(Object num : list){
            sum += (Double)num;
        }
        System.out.println("Tong cac so trong List = "+ sum);
    }


}
