package DataStructures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class HW1305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Character> result = new LinkedList<Character>();
        System.out.println("Nhập chuỗi: ");
        String str = scanner.nextLine();

        for(int i =0; i< str.length(); i++){
            char ch = str.charAt(i);
            result.offer(ch);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!result.isEmpty()){
            stringBuilder.append(result.poll());
        }
        System.out.println("Chuỗi vừa nhập: " + stringBuilder);
        scanner.close();
}
}
