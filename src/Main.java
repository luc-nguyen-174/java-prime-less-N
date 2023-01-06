import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n:");
        int n = scanner.nextInt();

        if (n > 1) {
            System.out.println("Hiển thị các số nguyên tố nhỏ hơn " + n + "!");
            System.out.println(2);
        }
        for (int i = 3; i <= n; i++) {
            int counter = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                System.out.println(i);
            }
        }
    }
}