package BasicSyntaxCondStateAndLoop;

import java.util.Scanner;

public class P11MultiplicationTable20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        if (times > 10){
            System.out.printf("%d X %d = %d\n",number, times,number*times);
        }
        while (times <= 10){
            int sum = number * times;
            System.out.printf("%d X %d = %d\n",number, times, sum);


            times++;
        }
    }
}
