package DataStructures;

import java.util.Scanner;
import java.util.Stack;

public class HW1304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack <Character> result = new Stack<Character>();
        System.out.println("Nhập chuỗi cần đảo ngược: ");
        String str = scanner.nextLine();

        for(int i =0; i< str.length(); i++){
            char ch = str.charAt(i);
            result.push(ch);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!result.isEmpty()){å
            stringBuilder.append(result.pop());
        }
        System.out.println("Chuỗi đảo ngược: " + stringBuilder);

        scanner.close();
    }

}
