package BasicSyntaxCSLoopsExe;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberPeople = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.0;
        double totalPrice = 0.0;

        switch (type){
            case "Students":

                    if (day.equals("Friday")) {
                        price = 8.45;
                        totalPrice = price * numberPeople;
                    } else if (day.equals("Saturday")) {
                        price = 9.80;
                        totalPrice = price * numberPeople;
                    } else if (day.equals("Sunday")) {
                        price = 10.46;
                        totalPrice = price * numberPeople;
                    }
                if (numberPeople >=30) {
                    totalPrice = 0.85 * totalPrice;
                }
                break;
            case "Business":
                if (day.equals("Friday")){
                    price = 10.90;
                    totalPrice = price * numberPeople;
                }else if (day.equals("Saturday")){
                    price = 15.60;
                    totalPrice = price * numberPeople;
                }else if (day.equals("Sunday")){
                    price = 16;
                    totalPrice = price * numberPeople;
                }
                if (numberPeople >=100){
                    totalPrice = (numberPeople - 10) * price;
                }
                break;
            case "Regular":
                if (day.equals("Friday")){
                    price = 15;
                    totalPrice = price * numberPeople;
                }else if (day.equals("Saturday")){
                    price = 20;
                    totalPrice = price * numberPeople;
                }else if (day.equals("Sunday")){
                    price = 22.50;
                    totalPrice = price * numberPeople;
                }
                if (numberPeople >=10 && numberPeople <=20 ){
                    totalPrice = 0.95 * totalPrice;
                }
                break;

        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
