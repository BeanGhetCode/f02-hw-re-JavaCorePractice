package OperatorAndConditions;

public class HW02 {
    public static void main(String[] args) {
        int a = 0;

        if(a > 0 ){
            System.out.printf("%d la so duong ",a);
        } else if (a < 0) {
            System.out.printf("%d la so am ",a);

        }else{
            System.out.printf("%d = 0 ",a);
        }


        String rs2;
        rs2 = (a%2 == 0) ? "%d la so chan" : "%d la so le";
        System.out.printf("%n" + rs2, a);

    }
}
