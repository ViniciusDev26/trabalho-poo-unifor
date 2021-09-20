package sample;

// https://github.com/ViniciusDev26/trabalho-poo-unifor/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1 - Troca de variavel");
        System.out.println("2 - Contagem");
        System.out.println("3 - Somatório");
        System.out.println("4 - Fatorial");
        System.out.println("5 - Função seno");
        System.out.println("6 - Fibonacci");
        System.out.println("7 - Inversão de Dígitos");
        System.out.println("8 - Conversão de Base");
        System.out.println("9 - Conversão de Tipos");

        System.out.println("Escolha um algoritmo");
        int option = scan.nextInt();

        switch(option){
            case 1:
                System.out.println("Digite o valor da variavel A");
                String varA = scan.next();

                System.out.println("Digite o valor da variavel B");
                String varB = scan.next();

                String[] result = TrocaDeVariaveis.changeIntegers(varA, varB);

                System.out.println("Valor da variavel A: " + result[0]);
                System.out.println("Valor da variavel B: " + result[1]);
                break;
            case 2:
                System.out.println("Digite o numero de alunos");
                int numeroDeAlunos = scan.nextInt();

                int numeroAlunosAprovados = Contagem.contador(numeroDeAlunos);
                System.out.println("A quantidade de alunos aprovados é de: " + numeroAlunosAprovados);
                break;
            case 3:
                System.out.println("Somatorio");
                double total = Somatorio.somar();

                System.out.println("Valor da soma é de: " + total);
                break;
            case 4:
                System.out.println("Digite o numero que deseja obter o fatorial");
                int number = scan.nextInt();

                int resultFatorial = Fatorial.getFatorial(number);
                System.out.println("O fatorial é: " + resultFatorial);
                break;
            case 5:
                System.out.println("Digite o valor de X");
                double value = scan.nextDouble();

                System.out.println("Digite o numero de termos para execução");
                int quantidadeDeRepeticoes = scan.nextInt();

                double senoResult = Seno.getSeno(value, quantidadeDeRepeticoes);

                System.out.println("O resultado do seno é: " + senoResult);
                break;
            case 6:
                System.out.println("Quantidade de numeros da sequencia de fibonacci que deseja ver");
                int quantidade = scan.nextInt();

                Fibonacci.mostrarFibonacci(quantidade);
                break;
            case 7:
                System.out.println("Digite o numero que vc deseja inverter a ordem");
                String numberToInvert = scan.next();

                String invertedNumbers = Inverter.inverterDigitos(numberToInvert);

                System.out.println("Resultado");
                System.out.println(invertedNumbers);

                break;
            case 8:
                System.out.println("Digite o numero para converter para binario");
                int numberToConverter = scan.nextInt();

                String numberConverted = ConverterBaseParaBinario.converter(numberToConverter);
                System.out.println("O numero convertido para binario fica: " + numberConverted);

                break;
            case 9:
                System.out.println("Digite a representação por caracteres do numero inteiro:");
                char caractere = scan.next().charAt(0);

                int numberResulted = ConverterParaNumero.converterParaInt(caractere);
                System.out.println("O valor do caractere é de: " + numberResulted);
                break;
            default:
                System.out.println("Escolha uma opção válida");
                break;
        }

        scan.close();
    }
}
