public class HW06 {
    public static boolean kiemTraDoiXung (int [] arr){
        for (int i =0; i<arr.length; i++){
            if(arr[i] == arr[arr.length- (i + 1)]){
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,3,2,1};
        String result = kiemTraDoiXung(arr)? "YES":"NO";
        System.out.println(result);
    }
}
