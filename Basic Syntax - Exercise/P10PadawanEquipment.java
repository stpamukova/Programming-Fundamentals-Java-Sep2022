package BasicSyntaxCSLoopsExe;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double pricePerSaber  = Double.parseDouble(scanner.nextLine());
        double pricePerRobe = Double.parseDouble(scanner.nextLine());
        double pricePerBelt = Double.parseDouble(scanner.nextLine());

        double cost = pricePerSaber * (students + Math.ceil(0.10 * students)) + pricePerRobe * students +
                pricePerBelt * (students - Math.abs(students / 6));

                if (cost <= budget){
                    System.out.printf("The money is enough - it would cost %.2flv.", cost);
                }else{
                    System.out.printf("George Lucas will need %.2flv more.", cost - budget);
                }


    }

}
