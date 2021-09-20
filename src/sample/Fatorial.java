package sample;

public class Fatorial {
    public static int getFatorial(int number){
        int counter = number;
        while(number > 1){
            counter = counter * (number - 1);
            number --;
        }

        return counter;
    }
}
