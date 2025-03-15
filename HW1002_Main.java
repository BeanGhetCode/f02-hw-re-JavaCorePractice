package Class;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(2, 6);

        System.out.println("Phân số 1: " + f1.toFractionString());
        System.out.println("Phân số 2: " + f2.toFractionString());

        Fraction sum = f1.sum(f2);
        System.out.println("Tổng hai phân số: " + sum.toFractionString());

        Fraction subtract =f1.subtract(f2);
        System.out.println("Hiệu hai phân số: " + subtract.toFractionString());

        Fraction multiply =f1.multiply(f2);
        System.out.println("Tích hai phân số: " + multiply.toFractionString());

        Fraction divide =f1.divide(f2);
        System.out.println("Thương hai phân số: " + divide.toFractionString());
    }
}
