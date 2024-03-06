package Dataexample;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        int tester;
        Scanner newInput = new Scanner(System.in);
        do {
            System.out.println("Invalid Number: Try Again - ");
            tester = newInput.nextInt();
        } while (tester < 1 || tester > 10);

        System.out.println("The factorial of " + tester + " = " + calcFactorial(tester));
        int a = 108;
        int b = 48;
        System.out.println("GCD of a and b is " + calcGcd(a, b));
    }

    public static long calcFactorial(int input) {
        if (input == 1) {
            return 1;
        }
        return input * calcFactorial(input - 1);
    }

    public static long calcGcd(int a, int b) {
        if (b != 0) {
            return calcGcd(b, a % b);
        } else {
            return a;
        }
    }
}
