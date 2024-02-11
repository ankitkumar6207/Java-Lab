// WAP  to print the following series and also find the sum of following series:
// 1 + 2^3+ 3^2 + 4^3 + ... n

import java.util.Scanner;

public class Series4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += (int) Math.pow(i, 3);
                System.out.print(i+"^3");
            } else {
                sum += (int) Math.pow(i, 2);
                System.out.print(i+"^2");
            }
            if (i != n)
                System.out.print(" + ");
        }
        System.out.println();
        System.out.println("Sum of the series: " + sum);
    }
}
