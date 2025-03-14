public class HW07 {
    public static int demSoLanXuatHien (int [] arr, int n){
        int count = 0;
        for (int i =0; i<arr.length; i++){
            if(arr[i] == n){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,5,4,2,3,4};
        boolean check = false;
        for (int i =0; i< arr.length; i++){
            if(demSoLanXuatHien(arr, arr[i]) > 1){
                System.out.println(arr[i]);
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("NO");
        }

    }
}
