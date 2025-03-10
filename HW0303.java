package OperatorAndConditions;

public class HW03 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        System.out.printf("%d + %d = %d %n" , a,b,a+b);
        System.out.printf("%d - %d = %d %n" , a,b,a-b);
        System.out.printf("%d * %d = %d %n" , a,b,a*b);
        if (b ==0){
            System.out.println("Mau bang 0");
        }
        else{
            double result =  (double)a/b;
            System.out.printf("%d / %d = %f %n" , a,b,result);
        }
    }
}
