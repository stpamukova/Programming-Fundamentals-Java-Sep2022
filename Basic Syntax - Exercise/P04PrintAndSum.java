package BasicSyntaxCSLoopsExe;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = start; i <= end; i++) {
            System.out.printf("%d ", i);
            sum = sum + i;

        }
        // System.out.println(); - принтираме празен ред
        System.out.printf("\nSum: %d", sum);
    }
}
