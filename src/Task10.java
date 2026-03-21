import java.util.Scanner;

public class Task10 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n <= 0 || n % 2 != 0) return false;
        return isPowerOfTwo(n / 2);
    }
}