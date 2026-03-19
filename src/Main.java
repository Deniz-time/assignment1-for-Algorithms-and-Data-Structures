import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose task:");
        System.out.println("1 - Sum of squares");
        System.out.println("2 - Sum of array");
        System.out.println("3 - Sum of n numbers");
        System.out.println("4 - Sum of powers");
        System.out.println("5 - Reverse integers");
        System.out.println("6 - Reverse strings");
        System.out.println("7 - Spiral matrix");
        System.out.println("8 - Sequences");
        System.out.println("9 - Permutations");
        System.out.println("10 - Power of two");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Task1.run();
                break;
            case 2:
                Task2.run();
                break;
            case 3:
                Task3.run();
                break;
            case 4:
                Task4.run();
                break;
            case 5:
                Task5.run();
                break;
            case 6:
                Task6.run();
                break;
            case 7:
                Task7.run();
                break;
            case 8:
                Task8.run();
                break;
            case 9:
                Task9.run();
                break;
            case 10:
                Task10.run();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}