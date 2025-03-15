package Class;

public class Fraction {
    private int numerator; // Tử số
    private int denominator; // Mẫu số

    // Constructor có tham số
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Mẫu số không thể bằng 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Constructor không tham số (mặc định = 0/1)
    public Fraction() {
        this(0, 1);
    }

    // Tìm UCLN
    private static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Rút gọn phân số
    public Fraction shorten() {
        int gcd = GCD(this.numerator, this.denominator);
        return new Fraction(this.numerator / gcd, this.denominator / gcd);
    }

    public String toFractionString() {
        return numerator + "/" + denominator;
    }

    // Cộng hai phân số
    public Fraction sum(Fraction other) {
        int newNumerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator).shorten();
    }

    // Trừ hai phân số
    public Fraction subtract(Fraction other) {
        int newNumerator = (this.numerator * other.denominator) - (other.numerator * this.denominator);
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator).shorten();
    }

    //Nhân hai phân số
    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator).shorten();
    }

    //Chia hai phân số
    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Không thể chia cho phân số có tử số bằng 0!");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator).shorten();
    }

}
