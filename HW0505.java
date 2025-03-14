import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class HW05 {
    public static ArrayList<Integer> docFile (String fileName){
        ArrayList<Integer> nums = new ArrayList<>();
        File input = new File (fileName);

        try (Scanner scanner = new Scanner(input)){
            while (scanner.hasNext()){
                if(scanner.hasNextInt()){
                    nums.add(scanner.nextInt());
                }
                else{
                    scanner.next();
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file");
        }
        return nums;
    }
    public static void ghiTongVaoFile (String fileName, ArrayList<Integer>nums ){
        File outputFile = new File(fileName);
        int sum = 0;
        try(PrintWriter output = new PrintWriter(outputFile)){
            output.println("Cac so nguyen doc duoc: ");
            for(int num : nums){
                output.println(num);
                sum+=num;
            }
            output.println("Tong cac so = " + sum);
            System.out.println("Ghi thanh cong vao tep");
        } catch (IOException e) {
            System.out.println("Loi ghi file: " + e.getMessage());
        }

    }
    public static void main(String[] args) {
        String input = "src/Array/input05.txt";
        String output = "src/Array/output05.txt";
        ArrayList<Integer> nums = docFile(input);
        ghiTongVaoFile(output, nums);

    }
}
