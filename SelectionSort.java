public class SelectionSort {

    public static int[] sort(int[] vetor, int[] stats) {
        int n = vetor.length;
        int trocas = 0, iteracoes = 0;

        for (int i = 0; i < n - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < n; j++) {
                iteracoes++;
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            if (menor != i) {
                int aux = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = aux;
                trocas++;
            }
        }

        stats[0] = trocas;
        stats[1] = iteracoes;
        return vetor;
    }
}
