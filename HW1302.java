package DataStructures;

import java.util.HashMap;
import java.util.Scanner;

public class HW1302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một đoạn văn: ");
        String str = scanner.nextLine();
        HashMap<Character,Integer> result = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLetter(ch)) {
                if (result.containsKey(ch)) {
                    result.put(ch, result.get(ch) + 1);
                }
                else {
                    result.put(ch, 1);
                }
            }
        }
        if(str.isEmpty()){
            System.out.println("Văn bảng trống!");
        }
        else{
            System.out.println("Các từ có tronng đoạn văn" + result);
        }
        scanner.close();
    }


}
