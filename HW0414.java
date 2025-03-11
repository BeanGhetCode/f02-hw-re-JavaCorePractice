package LoopFunction;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String str = scanner.nextLine();
        scanner.close();
        if(str.isEmpty()){
            System.out.println("Chuoi rong!");
        }
        else {
            char maxChar = ' ';
            int maxCount = 0;
            for(int i =0; i< str.length(); i++){
                char currentChar = str.charAt(i);
                int count =0;
                for (int j = 0; j<str.length(); j++){
                    if (currentChar == str.charAt(j)){
                        count ++;
                    }
                }
                if (count > maxCount){
                    maxChar = currentChar;
                    maxCount = count;
                }
            }
            System.out.println("Ký tự xuất hiện nhiều nhất: '" + maxChar + "' với " + maxCount + " lần.");
        }
    }
}
