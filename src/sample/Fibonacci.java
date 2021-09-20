package sample;

public class Fibonacci {
    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void mostrarFibonacci(int quantidade) {

        // teste do programa. Imprime os 30 primeiros termos
        for (int i = 0; i < quantidade; i++) {
            System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t");
        }

    }
}
