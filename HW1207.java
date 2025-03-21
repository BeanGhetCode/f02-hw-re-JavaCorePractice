package Exception;

import java.io.File;
import java.io.PrintWriter;

public class HW1207 {
    public static void main(String[] args) {
        File outputFile = new File("src/Exception/HW1107.txt");

        try(PrintWriter output = new PrintWriter(outputFile)){
            output.print("Hello Java");
        }
        catch (Exception e) {
            System.out.println("Lỗi khi xử lý tệp: " + e.getMessage());
        }
    }
}
