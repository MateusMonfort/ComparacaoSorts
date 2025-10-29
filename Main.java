public class Main {
    
    public static void main(String[] args) {
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        
        System.out.println("=====================================");
        System.out.println("  COMPARACAO DE ALGORITMOS DE SORTS");
        System.out.println("=====================================\n");
        
        testar("Bubble Sort (com Flag)", vetor1, vetor2, vetor3, BubbleSortFlag::sort);
        testar("Selection Sort", vetor1, vetor2, vetor3, SelectionSort::sort);
        testar("Cocktail Sort", vetor1, vetor2, vetor3, CocktailSort::sort);
        testar("Comb Sort", vetor1, vetor2, vetor3, CombSort::sort);
        testar("Gnome Sort", vetor1, vetor2, vetor3, GnomeSort::sort);
        testar("Bucket Sort", vetor1, vetor2, vetor3, BucketSort::sort);
        
        System.out.println("=====================================");
    }
    
    interface Algoritmo {
        int[] sort(int[] vetor, int[] stats);
    }
    
    private static void testar(String nome, int[] v1, int[] v2, int[] v3, Algoritmo algoritmo) {
        System.out.println("\n==== " + nome + " ====");
        
        int[] stats = {0, 0};
        algoritmo.sort(v1.clone(), stats);
        System.out.println("Vetor 1 -> Trocas: " + stats[0] + " | Iteracoes: " + stats[1]);
        
        stats[0] = stats[1] = 0;
        algoritmo.sort(v2.clone(), stats);
        System.out.println("Vetor 2 -> Trocas: " + stats[0] + " | Iteracoes: " + stats[1]);
        
        stats[0] = stats[1] = 0;
        algoritmo.sort(v3.clone(), stats);
        System.out.println("Vetor 3 -> Trocas: " + stats[0] + " | Iteracoes: " + stats[1]);
    }
}
