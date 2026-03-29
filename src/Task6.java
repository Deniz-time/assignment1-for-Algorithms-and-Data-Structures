import java.util.Scanner;

public class Task6 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        reverse(n, sc);
    }

    public static void reverse(int n, Scanner sc) {
        if (n == 0) return;

        String s = sc.nextLine();
        reverse(n - 1, sc);
        System.out.println(s);
    }
}