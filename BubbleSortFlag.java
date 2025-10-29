public class BubbleSortFlag {

    public static int[] sort(int[] vetor, int[] stats) {
        int n = vetor.length;
        int trocas = 0, iteracoes = 0;
        boolean flag;

        for (int i = 0; i < n - 1; i++) {
            flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                iteracoes++;
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    trocas++;
                    flag = true;
                }
            }
            if (!flag) break;
        }

        stats[0] = trocas;
        stats[1] = iteracoes;
        return vetor;
    }
}
