import java.util.Arrays;

public class Ex05 {
    public static void generateTriangle (int []arr){
        if (arr.length < 1){
            return;
        }
        System.out.println(Arrays.toString(arr));

        int [] nextRows = new int [arr.length-1];
        for(int i=0; i< arr.length-1; i++){
            nextRows[i] = arr[i] + arr[i+1];
        }
        generateTriangle(nextRows);
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        generateTriangle(arr);
    }
}
