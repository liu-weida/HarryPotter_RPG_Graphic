import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

public class Main {
    private static int SIZE = Integer.MAX_VALUE / 1000 ;;
    private static int[] tableau = new int[SIZE];
    public static void main(String[] args) {
        long temps = 0;
        initialiserTableau();
        int[] tri = copierTableaux();
        Instant start = Instant.now();
        for (int i = 4; i < 5; i++){
            //triSelection(tri);
            //triInsertion(tri);
            //triBulles(tri);
            quicksort(tri, 0, SIZE - 1);
            //triJava(tri);
    }
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        temps = duration/5;
        System.out.println("Le temps moyen pour les cinq tirs était de " + temps + " ms.");
    }
    public static void initialiserTableau() {
        Instant start = Instant.now();
        System.out.println("Debut d’initialisation...");
        Random random = new Random();
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(SIZE);
        }
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println("L’initialisation a pris " + duration + " ms");

        int[] tableauSelection = new int[SIZE];
        System.arraycopy(tableau, 0, tableauSelection, 0, SIZE);
    }
    public static int[] copierTableaux(){
        int[] tri = new int[SIZE];
        System.arraycopy(tableau, 0, tri, 0, SIZE);
        return tri;
    }

    public static void triSelection(int[] tableau) {

            for (int i = 0; i < tableau.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < tableau.length; j++) {
                    if (tableau[j] < tableau[minIndex]) {
                        minIndex = j;
                    }
                }
                if (minIndex != i) {
                    int temp = tableau[i];
                    tableau[i] = tableau[minIndex];
                    tableau[minIndex] = temp;
                }
            }
    }

    public static void triInsertion(int[] tableau) {

        for (int i = 1; i < tableau.length; i++) {
            int value = tableau[i];
            int index = i;
            for (int j = i - 1; j >= 0; j--) {
                if (tableau[j] > value) {
                    tableau[j + 1] = tableau[j];
                    index = j;
                } else {
                    break;
                }
            }
            tableau[index] = value;
        }
    }

    public static void triBulles(int[] tableau) {

            int n = tableau.length;
            for (int i = 0; i < n - 1; i++)
                for (int j = 0; j < n - i - 1; j++)
                    if (tableau[j] > tableau[j + 1]) {
                        int temp = tableau[j];
                        tableau[j] = tableau[j + 1];
                        tableau[j + 1] = temp;
                    }
        }



    public static void quicksort(int[] tableau, int indiceGauche, int indiceDroit) {
        if (indiceGauche < indiceDroit) {
            int indicePartition = partition(tableau, indiceGauche, indiceDroit);
            quicksort(tableau, indiceGauche, indicePartition);
            quicksort(tableau, indicePartition + 1, indiceDroit);
        }
    }
    public static int partition(int[] tableau, int indiceGauche, int indiceDroit) {
        int elementPivot = tableau[indiceGauche + (indiceDroit - indiceGauche) / 2];
        int left = indiceGauche - 1;
        int right = indiceDroit + 1;
        while (true) {
            do {
                left++;
            } while (tableau[left] < elementPivot);
            do {
                right--;
            } while (tableau[right] > elementPivot);
            if (left >= right) {
                return right;
            }
            int tmp = tableau[left];
            tableau[left] = tableau[right];
            tableau[right] = tmp;
        }
    }
    public static void triJava(int[] tableau){

        Arrays.sort(tableau);

    }

}