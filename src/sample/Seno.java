package sample;

public class Seno {
    static double getSeno(double  value, int quantidadeDeRepeticoes) {
        double seno = 0;
        int aux = 1;
        boolean sum = true;

        for(int index = 0; index < quantidadeDeRepeticoes; index++){
            if(sum){
                seno += Math.pow(value, aux)/Fatorial.getFatorial(aux);
            }else {
                seno -= Math.pow(value, aux)/Fatorial.getFatorial(aux);
            }

            aux += 2;
            sum = !sum;
        }

        return seno;
    }
}
