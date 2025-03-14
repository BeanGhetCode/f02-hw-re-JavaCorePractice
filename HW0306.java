package OperatorAndConditions;

public class HW06 {
    public static void main(String[] args) {
        double a = 10.0;
        double b = 2.0;
        double c = 2.5;
        if ((a + b > c) && (a + c > b) && (b+c >a)){
            System.out.printf("%.1f, %.1f, %.1f, la ba canh cua tam giac %n", a,b,c);
        }else{
            System.out.printf("%.1f, %.1f, %.1f, khong la ba canh cua tam giac %n", a,b,c);
        }
    }
}
