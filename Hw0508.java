import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class HW08 {
    public static ArrayList<Integer> docFile (String fileName){
        ArrayList<Integer> nums = new ArrayList<>();
        File input = new File (fileName);
        try(Scanner scanner = new Scanner(input)){
            while(scanner.hasNext()){
                if(scanner.hasNextInt()){
                    nums.add(scanner.nextInt());
                }
                else {
                    scanner.next();
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Khong tim thay file");
        }
        return nums;
    }
    public static boolean kiemTraChuSoNguyenTo(int n) {

        while(n>0){
            int temp = n%10;
            if(temp<2){
                return false;

            }
            else{
                for(int i=2; i*i<=temp; i++){
                    if(temp%i==0){
                        return false;
                    }
                }

            }
            n = n/10;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "src/Array/input08.txt";
        File outputFile = new File( "src/Array/output08.txt");
        try(PrintWriter output = new PrintWriter(outputFile)){

            ArrayList<Integer> nums = docFile(input);
            // Đếm số lần xuất hiện của mỗi số trong HashMap
            Map<Integer, Integer> countMap = new HashMap<>();
            for (int num : nums) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
            // In ra các số nguyên tố với số lần xuất hiện
            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                int num = entry.getKey();
                if (kiemTraChuSoNguyenTo(num)) {
                    output.println(num + " " + entry.getValue());
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi khi xử lý tệp: " + e.getMessage());
        }



    }
}
