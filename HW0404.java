public class Ex04 {
    public static void main(String[] args) {
        System.out.println("Các số chia hết cho 5 hoặc cho 6 nhưng không đồng thời chia hết cho cả hai trong khoảng [100, 200]: ");
        for(int i = 100; i <= 200; i++) {
            if ((i % 5 == 0) ^ (i % 6 == 0)) {
                System.out.println(i);
            }
        }
    }
}
