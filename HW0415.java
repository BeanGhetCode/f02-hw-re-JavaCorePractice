
public class Ex15 {
    public static int UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int BCNN (int a, int b){
        return (a*b)/UCLN(a,b);
    }
    public static void main(String[] args) {
        System.out.println("Uoc chung lon nhat cua 27 vaf 45 la:  " + UCLN(27, 45));
        System.out.println("Boi chung nho nhat cua 27 vaf 45 la:  " + BCNN(27,45));
    }
}
