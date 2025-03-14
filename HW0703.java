public class Ex03 {
    public static int exponential (int x, int n){
        if (n==0){
            return 1;
        }
        if (n == 1){
            return x;
        }
        return x * exponential(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println(exponential(2,3  ));
    }
}
