
public class Ex12 {
    public static boolean ktHoanHao (int n){
        int check = 0;
        for (int i =1; i<n/2; i++){
            if(n%i ==0){
                check += i;
            }
        }
        return check == n;
    }
    public static void main(String[] args) {
        System.out.println("Cac so hoan hao < 10000");
        for(int i =1; i<10000; i++){
            if(ktHoanHao(i)){
                System.out.println(i);
            }
        }
    }
}
