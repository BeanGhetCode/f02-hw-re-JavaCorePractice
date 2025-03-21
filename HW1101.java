package OOP_Principles;
import java.math.BigDecimal;
import java.math.BigInteger;

/*
Thực hiện viết code ví dụ sử dụng các method equals, toString và các method của các Wrapper, String,
StringBuilder, BigInteger, BigDecimal class.
*/
public class OOP_Principles {
    public static void main(String[] args) {
        // equals va toString
        Integer num1 = 100;
        Integer num2 = 200;
        System.out.println("num1 equals num2: " + num1.equals(num2));
        System.out.println("num1 toString: " + num1.toString());

        // Wrapper class
        Double b = Double.valueOf("1.5");
        int i = b.intValue();
        System.out.println("Double to int: " + i);

        // String class
        String str = "Hello Java";
        System.out.println("Length of String: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());

        // StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" Java");
        System.out.println("StringBuilder: " + stringBuilder);
        stringBuilder.reverse();
        System.out.println("StringBuilder after reverse: "+ stringBuilder);

        // BigInteger
        BigInteger bigInt1 = new BigInteger("23425234234233645645234234234234");
        BigInteger bigInt2 = new BigInteger("56345234645624523453453452342");
        System.out.println("bigInt1 + bigInt2 = " + bigInt1.add(bigInt2));
        System.out.println("bigInt1 * bigInt2 = " + bigInt1.multiply(bigInt2));


        // BigDecimal
        BigDecimal bigDec1 = new BigDecimal("5434.23423434");
        BigDecimal bigDec2 = new BigDecimal("10.4");
        System.out.println("bigDec1 + bigDec2 = " + bigDec1.add(bigDec2));
        System.out.println("bigDec1 * bigDec2 = " + bigDec1.multiply(bigDec2));

    }
}
