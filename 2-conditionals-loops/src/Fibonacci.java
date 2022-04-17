import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int a =0;
        int b = 1;

        for (int i = 2; i < n; i++) {
            int temp = b;
            b = a+b;
            a = temp;
        }

        System.out.println(b);
    }
}
