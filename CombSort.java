public class CombSort {

    public static int[] sort(int[] vetor, int[] stats) {
        int n = vetor.length;
        int trocas = 0, iteracoes = 0;
        int intervalo = n;
        boolean trocou = true;

        while (intervalo > 1 || trocou) {
            intervalo = (int) (intervalo / 1.3);
            if (intervalo < 1) intervalo = 1;

            trocou = false;

            for (int i = 0; i + intervalo < n; i++) {
                iteracoes++;
                if (vetor[i] > vetor[i + intervalo]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + intervalo];
                    vetor[i + intervalo] = aux;
                    trocas++;
                    trocou = true;
                }
            }
        }

        stats[0] = trocas;
        stats[1] = iteracoes;
        return vetor;
    }
}
