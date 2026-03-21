import java.util.Scanner;

public class Task7 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        fill(arr, 0, n, 1);
        print(arr, n);
    }

    public static void fill(int[][] a, int layer, int n, int num) {
        if (layer >= (n + 1) / 2) return;

        for (int i = layer; i < n - layer; i++) a[layer][i] = num++;
        for (int i = layer + 1; i < n - layer; i++) a[i][n - layer - 1] = num++;
        for (int i = n - layer - 2; i >= layer; i--) a[n - layer - 1][i] = num++;
        for (int i = n - layer - 2; i > layer; i--) a[i][layer] = num++;

        fill(a, layer + 1, n, num);
    }

    public static void print(int[][] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}