package sample;

public class TrocaDeVariaveis {
    static String[] changeIntegers(String firstVariable, String secondVariable) {
        String aux = firstVariable;
        firstVariable = secondVariable;
        secondVariable = aux;

        String[] variables = {firstVariable, secondVariable};
        return variables;
    }
}
