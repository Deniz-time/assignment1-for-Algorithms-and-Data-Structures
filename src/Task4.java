import java.util.Scanner;

public class Task4 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(sum(b, n));
    }

    public static int sum(int b, int n) {
        if (n == 0) return 1;
        return power(b, n) + sum(b, n - 1);
    }

    public static int power(int b, int n) {
        if (n == 0) return 1;
        return b * power(b, n - 1);
    }
}