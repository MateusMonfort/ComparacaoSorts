public class CocktailSort {

    public static int[] sort(int[] vetor, int[] stats) {
        int n = vetor.length;
        int trocas = 0, iteracoes = 0;
        int esq = 0, dir = n - 1;
        boolean trocou = true;

        while (trocou) {
            trocou = false;

            for (int i = esq; i < dir; i++) {
                iteracoes++;
                if (vetor[i] > vetor[i + 1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    trocas++;
                    trocou = true;
                }
            }

            if (!trocou) break;

            dir--;
            trocou = false;

            for (int i = dir; i > esq; i--) {
                iteracoes++;
                if (vetor[i] < vetor[i - 1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i - 1];
                    vetor[i - 1] = aux;
                    trocas++;
                    trocou = true;
                }
            }

            esq++;
        }

        stats[0] = trocas;
        stats[1] = iteracoes;
        return vetor;
    }
}
