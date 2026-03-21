import java.util.Scanner;

public class Task9 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        permute("", s);
    }

    public static void permute(String prefix, String s) {
        if (s.length() == 0) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            permute(prefix + s.charAt(i),
                    s.substring(0, i) + s.substring(i + 1));
        }
    }
}