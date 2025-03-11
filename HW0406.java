public class Ex06 {
    public static boolean ktNguyenTo (int n){
        if (n <2){
            return false;
        }
        else{
            for (int i =2; i*i<=n; i++){
                if (n%i ==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Cac so nguyen to trong khoang tu [2,1000]: ");
        for(int i=2; i<=1000; i++){
            if(ktNguyenTo(i) == true){
                System.out.print(i+",");
            }
        }
    }
}

