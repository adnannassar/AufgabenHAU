package Debug;

import java.util.Scanner;

public class DebugExample {
    public static void main(String[] args) {
        System.out.println("Hallo to my App");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nr1: ");
        int nr1 = scanner.nextInt();
        System.out.print("Nr2: ");
        int nr2 = scanner.nextInt();

        int sum = add(nr1, nr2);
        System.out.println("Sum = " + sum);

        int mulErg = mul(nr1, nr2);
        System.out.println("Mul = " + mulErg);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int mul(int a, int b) {
        return a * b;
    }
}
