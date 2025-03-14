
public class Ex20 {
    public static void main(String[] args) {
        int n =30;
        int count = 0;

        for (int i = 1; i <= n; i++){
            if (n % i == 0 && i % 2 == 0){
                count ++;
            }
        }
        System.out.println("Co " + count + " uoc so cua " +n+" chia het cho 2");
    }
}
