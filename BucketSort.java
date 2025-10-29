public class BucketSort {

    public static int[] sort(int[] vetor, int[] stats) {
        int n = vetor.length;
        int trocas = 0, iteracoes = 0;

        if (n <= 1) {
            stats[0] = trocas;
            stats[1] = iteracoes;
            return vetor;
        }

        int maior = vetor[0], menor = vetor[0];
        for (int i = 1; i < n; i++) {
            iteracoes++;
            if (vetor[i] > maior) maior = vetor[i];
            if (vetor[i] < menor) menor = vetor[i];
        }

        int baldes = (int) Math.sqrt(n);
        if (baldes == 0) baldes = 1;

        int[][] balde = new int[baldes][n];
        int[] tamanho = new int[baldes];

        int alcance = maior - menor + 1;
        for (int i = 0; i < n; i++) {
            iteracoes++;
            int idx = (int) (((long)(vetor[i] - menor) * baldes) / alcance);
            if (idx >= baldes) idx = baldes - 1;
            balde[idx][tamanho[idx]] = vetor[i];
            tamanho[idx]++;
        }

        int pos = 0;
        for (int i = 0; i < baldes; i++) {
            iteracoes++;
            if (tamanho[i] > 0) {
                int[] sortStats = {0, 0};
                insertionSort(balde[i], tamanho[i], sortStats);
                trocas += sortStats[0];
                for (int j = 0; j < tamanho[i]; j++) {
                    iteracoes++;
                    vetor[pos++] = balde[i][j];
                }
            }
        }

        stats[0] = trocas;
        stats[1] = iteracoes;
        return vetor;
    }

    private static void insertionSort(int[] arr, int tam, int[] stats) {
        for (int i = 1; i < tam; i++) {
            int valor = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > valor) {
                arr[j + 1] = arr[j];
                stats[0]++;
                j--;
            }
            arr[j + 1] = valor;
        }
    }
}
