package BasicSyntaxCondStateAndLoop;

import java.util.Scanner;

public class P07TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int ticketPrice = 0;

        switch (dayType) {
            case "Weekday":
                if (0 <= age && age <= 18 || 64 < age && age <= 122) {
                    ticketPrice = 12;
                    System.out.printf("%d$", ticketPrice);
                } else if (18 < age && age <= 64) {
                    ticketPrice = 18;
                    System.out.printf("%d$", ticketPrice);
                } else {
                    System.out.println("Error!");
                }
                break;
            case "Weekend":
                if (0 <= age && age <= 18 || 64 < age && age <= 122) {
                    ticketPrice = 15;
                    System.out.printf("%d$", ticketPrice);
                } else if (18 < age && age <= 64) {
                    ticketPrice = 20;
                    System.out.printf("%d$", ticketPrice);
                } else {
                    System.out.println("Error!");
                }
                break;

            case "Holiday":
                if (0 <= age && age <= 18) {
                    ticketPrice = 5;
                    System.out.printf("%d$", ticketPrice);
                } else if (64 < age && age <= 122) {
                    ticketPrice = 10;
                    System.out.printf("%d$", ticketPrice);
                } else if (18 < age && age <= 64) {
                    ticketPrice = 12;
                    System.out.printf("%d$", ticketPrice);
                } else {
                    System.out.println("Error!");
                }
                break;
        }

    }
}

