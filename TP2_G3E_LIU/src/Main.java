import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//-----------------------------3.1.1-----------------------------------------------
//        discriminant();
//         }
//
//    public static void discriminant() {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Quelle est la valeur de a ?");
//        int a = scanner.nextInt();
//        System.out.println("Quelle est la valeur de b ?");
//        int b = scanner.nextInt();
//        System.out.println("Quelle est la valeur de c ?");
//        int c = scanner.nextInt();
//
//        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
//
//        if (delta < 0) {
//            System.out.println("Ce polynome n’a pas de racine reelle");
//        } else if (delta == 0) {
//            int racine = (b * -1)/(2 * a);
//                System.out.println("Une racine reelle :" + racine);
//        }else {
//            double racines1 = (b * -1 + Math.sqrt(delta))/(2 * a);
//            double racines2 = (b * -1 - Math.sqrt(delta))/(2 * a);
//            System.out.println("Deux racines reelles :" + racines1 + " et " + racines2);
//        }
//-----------------------------3.1.1-----------------------------------------------
//        parite();
//            }
//
//        public static void parite() {
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Veuillez entrer un nombre entier");
//
//            int nombre = scanner.nextInt();
//
//            if (nombre % 2 == 0) {
//                System.out.println("Une nombre pair: " + nombre);
//            }else {
//                System.out.println("Une nombre impair: " + nombre);
//
//            }
//-----------------------------3.1.2.1-----------------------------------------------
//        max();
//    }
//            public static void max(){
//                Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Veuillez entrer le premier nombre entier");
//
//            int nombre1 = scanner.nextInt();
//
//            System.out.println("Veuillez entrer le deuxième nombre entier");
//
//            int nombre2 = scanner.nextInt();
//
//            if (nombre1 > nombre2) {
//                System.out.println("Max: " + nombre1);
//            }else {
//                System.out.println("Max: " + nombre2);
//            }
//-----------------------------3.1.2.2-----------------------------------------------
//        min();
//    }
//            public static void min(){
//                Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Veuillez entrer le premier nombre entier");
//
//            int nombre1 = scanner.nextInt();
//
//            System.out.println("Veuillez entrer le deuxième nombre entier");
//
//            int nombre2 = scanner.nextInt();
//
//            if (nombre1 < nombre2) {
//                System.out.println("Min: " + nombre1);
//            }else {
//                System.out.println("Min: " + nombre2);
//            }
//--------------------------------------------3.1.4-------------------------------------------
//                egaliteStr();}
//            public static void egaliteStr(){
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Veuillez entrer la première chaîne de caractères");
//
//            String cara1 = scanner.nextLine();
//
//            System.out.println("Veuillez entrer le deuxième chaîne de caractères");
//
//            String cara2 = scanner.nextLine();
//
//             if (cara1.equals(cara2)) {
//            System.out.println("Les deux caractères sont identiques. ");
//        }else {
//            System.out.println("Les deux caractères sont différentes.");
//        }
//--------------------------------------------3.2-------------------------------------------
//                factorielle();}
//         public static void factorielle() {
//
//             int factorielle = 1;
//
//             Scanner scanner = new Scanner(System.in);
//             System.out.println("Saisir un entier positif ou nul");
//             int n = scanner.nextInt();
//
//             for (int i = 1; i <= n; i++) {
//                 factorielle *= i;
//             }
//
//             System.out.println(n + "! = " + factorielle);
//--------------------------------------------3.2.1-------------------------------------------
//        countdown();}
//    public static void countdown() {
//
//
//        for (int i=10; i>=0; i--){
//            System.out.println(i);
//        }
//        System.out.println("BOOM!");
//--------------------------------------------3.2.2-------------------------------------------
//        carres();}
//        public static void carres() {
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Veuillez entrer la valeur de x.");
//
//            int x = scanner.nextInt();
//            int x2 = x * x;
//            System.out.println(x + "\t" + x2);
//--------------------------------------------3.2.3---------------------------------------------
//        tableMultiplication();}
//        public static void tableMultiplication() {
//            for (int i = 1; i <= 10; i++) {
//                for (int j = 1; j<=10; j++){
//                System.out.print("\t" + i*j);
//                }
//                System.out.println();
//            }
//--------------------------------------------3.2.5---------------------------------------------
//        division() ;}
//
//    public static void division() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Veuillez saisir le premier entier");
//        int premierEntier = scanner.nextInt();
//
//        int deuxiemeEntier;
//        do {
//            System.out.println("Veuillez saisir le deuxieme entier");
//            deuxiemeEntier = scanner.nextInt();
//        }while(deuxiemeEntier == 0);
//
//            int quotient = premierEntier / deuxiemeEntier;
//            System.out.println("Le quotient de " + premierEntier + " divisé par " + deuxiemeEntier + " est egale a " + quotient);

//--------------------------------------------3.3.1---------------------------------------------
//            regle();
//     }
//
//         public static void regle() {
//         Scanner scanner = new Scanner(System.in);
//
//         int longueur;
//         do {
//             System.out.print("Longueur ? ");
//             longueur = scanner.nextInt();
//         } while (longueur <= 0);
//
//
//
//         for (int i = 0; i <= longueur; i++) {
//             if (i % 10 == 0) {
//                 System.out.print("|");
//             } else {
//                 System.out.print("-");
//             }
//         }
//--------------------------------------------3.3.2---------------------------------------------
//        nombrePremier() ;}
//
//    public static void nombrePremier() {
//        Scanner scanner = new Scanner(System.in);
//
//         int Entier;
//        do {
//            System.out.println("Veuillez saisir l'entier");
//            Entier = scanner.nextInt();
//        }while(Entier < 0);
//
//        boolean premier = true;
//        for (int i = 2; i < Entier; i++) {
//            if (Entier % i == 0) {
//                premier = false;
//                break;
//            }
//        }
//
//            if (premier){
//                System.out.println("Un nombre premier");
//            } else {
//                System.out.println("Pas un nombre premier");
//            }
//--------------------------------------------3.4.1---------------------------------------------
//        initialisationTableau();
//        }
//
//    public static void initialisationTableau() {
//        int[] tableau = new int[5];
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < tableau.length; i++) {
//            System.out.println("Saisir un entier");
//            int entier = scanner.nextInt();
//            tableau[i] = entier;
//        }
//        int max = tableau[0];
//        int min = tableau[0];
//        for (int i = 0; i < tableau.length; i++) {
//            if (tableau[i] < min) {
//                min = tableau[i];
//            }
//            if (tableau[i] > max) {
//                max = tableau[i];
//            }
//        }
//        System.out.println("Minimum : " + min);
//        System.out.println("Maximum : " + max);
//
//        int somme = 0;
//        for (int i = 0; i < tableau.length; i++) {
//            somme += tableau[i];
//        }
//        System.out.println("Somme est " + somme);
//
//        int[] paris = new int[5];
//        int j = 0;
//        for (int i = 0; i < tableau.length; i++) {
//            if (tableau[i] % 2 == 0) {
//                paris[j] = tableau[i];
//                j += 1;
//            }
//        }
//        System.out.println("\n");
//        System.out.println("Les éléments pairs du tableau sont :");
//        for (j = 0; j < paris.length; j++) {
//            if (paris[j] != 0) {
//                System.out.print("\t" + paris[j]);
//            }
//        }
//        System.out.println("\n");
//        System.out.println("Les éléments d’indice pair du tableau :");
//        for (int i = 0; i < tableau.length; i += 2) {
//            System.out.print("\t" + tableau[i]);
//        }
//        System.out.println("\n");
//        inverseTableau(tableau);
//
//       }
//
//    public static void inverseTableau(int[] tableau) {
//
//        System.out.println("Le tableau après le retournement est:");
//        for (int j= tableau.length - 1; j >= 0; j--){
//
//            System.out.print("\t" + tableau[j]);
//        }
//--------------------------------------------3.5---------------------------------------------

        System.out.println("Quel exercice ? Saisissez :");
        System.out.println("1. Discriminant\n" +
                "2. Parité d’un nombre\n" +
                "3. Calcul d’extremum-max\n" +
                "4. Calcul d’extremum-min\n" +
                "5. Égalité entre chaînes de caractères\n" +
                "6. Factorielle\n" +
                "7. Compte à rebous\n" +
                "8. Valeurs de carrés\n" +
                "9. Table de multiplication\n" +
                "10. Division d’entiers\n" +
                "11. Règle graduée\n" +
                "12. Nombres premiers\n" +
                "13. Manipulations sur un tableau");
        Scanner scanner = new Scanner(System.in);
        int choix = scanner.nextInt();
        switch (choix){
            case 1:
                discriminant();
                break;
            case 2:
                parite();
                break;
            case 3:
                max();
                break;
            case 4:
                min();
                break;
            case 5:
                egaliteStr();
                break;
            case 6:
                factorielle();
                break;
            case 7:
                countdown();
                break;
            case 8:
                carres();
                break;
            case 9:
                tableMultiplication();
                break;
            case 10:
                division() ;
                break;
            case 11:
                regle();
                break;
            case 12:
                nombrePremier() ;
                break;
            case 13:
                initialisationTableau();
                break;
        }}

    public static void discriminant() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();

        int delta = (int) (Math.pow(b, 2) - 4 * a * c);

        if (delta < 0) {
            System.out.println("Ce polynome n’a pas de racine reelle");
        } else if (delta == 0) {
            int racine = (b * -1) / (2 * a);
            System.out.println("Une racine reelle :" + racine);
        } else {
            double racines1 = (b * -1 + Math.sqrt(delta)) / (2 * a);
            double racines2 = (b * -1 - Math.sqrt(delta)) / (2 * a);
            System.out.println("Deux racines reelles :" + racines1 + " et " + racines2);
        }
    }
        public static void parite() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Veuillez entrer un nombre entier");

            int nombre = scanner.nextInt();

            if (nombre % 2 == 0) {
                System.out.println("Une nombre pair: " + nombre);
            }else {
                System.out.println("Une nombre impair: " + nombre);

            }
        }
            public static void max(){
                Scanner scanner = new Scanner(System.in);

            System.out.println("Veuillez entrer le premier nombre entier");

            int nombre1 = scanner.nextInt();

            System.out.println("Veuillez entrer le deuxième nombre entier");

            int nombre2 = scanner.nextInt();

            if (nombre1 > nombre2) {
                System.out.println("Max: " + nombre1);
            }else {
                System.out.println("Max: " + nombre2);
            }
            }
            public static void min(){
                Scanner scanner = new Scanner(System.in);

            System.out.println("Veuillez entrer le premier nombre entier");

            int nombre1 = scanner.nextInt();

            System.out.println("Veuillez entrer le deuxième nombre entier");

            int nombre2 = scanner.nextInt();

            if (nombre1 < nombre2) {
                System.out.println("Min: " + nombre1);
            }else {
                System.out.println("Min: " + nombre2);
            }
            }
            public static void egaliteStr(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Veuillez entrer la première chaîne de caractères");

            String cara1 = scanner.nextLine();

            System.out.println("Veuillez entrer le deuxième chaîne de caractères");

            String cara2 = scanner.nextLine();

             if (cara1.equals(cara2)) {
            System.out.println("Les deux caractères sont identiques. ");
        }else {
            System.out.println("Les deux caractères sont différentes.");
        }
            }
         public static void factorielle() {

             int factorielle = 1;

             Scanner scanner = new Scanner(System.in);
             System.out.println("Saisir un entier positif ou nul");
             int n = scanner.nextInt();

             for (int i = 1; i <= n; i++) {
                 factorielle *= i;
             }

             System.out.println(n + "! = " + factorielle);
         }
            public static void countdown() {


                for (int i=10; i>=0; i--){
                      System.out.println(i);
                }
                 System.out.println("BOOM!");
        }
            public static void carres() {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Veuillez entrer la valeur de x.");

                int x = scanner.nextInt();
                int x2 = x * x;
                System.out.println(x + "\t" + x2);
            }
            public static void tableMultiplication() {
                for (int i = 1; i <= 10; i++) {
                    for (int j = 1; j<=10; j++){
                    System.out.print("\t" + i*j);
                    }
                    System.out.println();
                }

            }
        public static void division() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Veuillez saisir le premier entier");
             int premierEntier = scanner.nextInt();

            int deuxiemeEntier;
            do {
                System.out.println("Veuillez saisir le deuxieme entier");
                deuxiemeEntier = scanner.nextInt();
            }while(deuxiemeEntier == 0);

                int quotient = premierEntier / deuxiemeEntier;
                System.out.println("Le quotient de " + premierEntier + " divisé par " + deuxiemeEntier + " est egale a " + quotient);


    }
        public static void regle() {
            Scanner scanner = new Scanner(System.in);

            int longueur;
             do {
               System.out.print("Longueur ? ");
                 longueur = scanner.nextInt();
            } while (longueur <= 0);



            for (int i = 0; i <= longueur; i++) {
                if (i % 10 == 0) {
                     System.out.print("|");
                } else {
                  System.out.print("-");
                }
            }

         }
        public static void nombrePremier() {
            Scanner scanner = new Scanner(System.in);

            int Entier;
            do {
                System.out.println("Veuillez saisir l'entier");
                Entier = scanner.nextInt();
            }while(Entier < 0);

         boolean premier = true;
         for (int i = 2; i < Entier; i++) {
             if (Entier % i == 0) {
                 premier = false;
                 break;
            }
        }

            if (premier){
                System.out.println("Un nombre premier");
            } else {
                System.out.println("Pas un nombre premier");
            }
    }
        public static void initialisationTableau() {
            int[] tableau = new int[5];
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < tableau.length; i++) {
                System.out.println("Saisir un entier");
                int entier = scanner.nextInt();
                tableau[i] = entier;
            }
            int max = tableau[0];
            int min = tableau[0];
            for (int i = 0; i < tableau.length; i++) {
                if (tableau[i] < min) {
                    min = tableau[i];
                }
                if (tableau[i] > max) {
                    max = tableau[i];
                }
            }
            System.out.println("Minimum : " + min);
            System.out.println("Maximum : " + max);

            int somme = 0;
            for (int i = 0; i < tableau.length; i++) {
                somme += tableau[i];
            }
            System.out.println("Somme est " + somme);

            int[] paris = new int[5];
            int j = 0;
            for (int i = 0; i < tableau.length; i++) {
                if (tableau[i] % 2 == 0) {
                    paris[j] = tableau[i];
                    j += 1;
                }
            }
            System.out.println("\n");
            System.out.println("Les éléments pairs du tableau sont :");
            for (j = 0; j < paris.length; j++) {
                if (paris[j] != 0) {
                    System.out.print("\t" + paris[j]);
                }
            }
            System.out.println("\n");
            System.out.println("Les éléments d’indice pair du tableau :");
            for (int i = 0; i < tableau.length; i += 2) {
                System.out.print("\t" + tableau[i]);
            }
            System.out.println("\n");
            inverseTableau(tableau);

        }

        public static void inverseTableau(int[] tableau) {

            System.out.println("Le tableau après le retournement est:");
            for (int j= tableau.length - 1; j >= 0; j--){

                System.out.print("\t" + tableau[j]);
            }
    }
}



