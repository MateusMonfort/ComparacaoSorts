public class GnomeSort {

    public static int[] sort(int[] vetor, int[] stats) {
        int n = vetor.length;
        int trocas = 0, iteracoes = 0;
        int pos = 0;

        while (pos < n) {
            iteracoes++;
            if (pos == 0) {
                pos++;
            } else if (vetor[pos] >= vetor[pos - 1]) {
                pos++;
            } else {
                int aux = vetor[pos];
                vetor[pos] = vetor[pos - 1];
                vetor[pos - 1] = aux;
                trocas++;
                pos--;
            }
        }

        stats[0] = trocas;
        stats[1] = iteracoes;
        return vetor;
    }
}
