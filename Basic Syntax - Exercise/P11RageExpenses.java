package BasicSyntaxCSLoopsExe;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        double cost = 0;

        int headsetCount = lostGamesCount / 2;
        int mouseCount = lostGamesCount / 3;
        int keyboardCount = lostGamesCount / 6;
        int displayCount = lostGamesCount / 12;

        cost = headsetCount * headsetPrice + mouseCount * mousePrice + keyboardCount * keyboardPrice +
                displayCount * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", cost);
    }

}

