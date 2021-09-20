package sample;

import java.util.Scanner;

public class Contagem {
    public static int contador(int numberToCounter) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;

        for(int index = 0; index < numberToCounter; index++){
            System.out.println("Digite a nota do aluno " + (index + 1));
            float nota = scan.nextFloat();

            if(nota >= 50){
                counter++;
            }
        }

        scan.close();
        return counter;
    }
}
