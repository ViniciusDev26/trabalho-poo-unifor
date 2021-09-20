package sample;

import java.util.Scanner;

public class Somatorio {
    public static double somar(){
        Scanner scan = new Scanner(System.in);
        double valueToSum = 0;
        double total = 0;
        System.out.println("o programa vai somar até ser enviado o valor 0");
        do {
            System.out.println("digite o valor a ser somado: ");
            valueToSum = scan.nextDouble();
            total += valueToSum;
        }while(valueToSum != 0);

        scan.close();
        return total;
    }
}
