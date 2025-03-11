public class Ex05 {
    public static void main(String[] args) {
        int n = 0;
        System.out.println("Số nguyên lớn nhất thỏa n^3 <12000");
        while ((n+1)*(n+1)*(n+1) < 12000){
            n++;
        }
        System.out.println(n);
    }
}
