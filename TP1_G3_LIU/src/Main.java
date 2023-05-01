import java.util.Scanner;

   public class Main {
//        public static void main(String[] args) {
// -------------------------------------------------4-------------------------------------------------------------------
//            Scanner scanner = new Scanner(System.in);
//            int unEntier = scanner.nextInt();
//            float unReel = scanner.nextFloat();
//            System.out.println("J’ai recupere un entier: " + unEntier);
//            System.out.println("J’ai aussi recupere un reel: " + unReel);

// -------------------------------------------------4.1----------------------------------------------------------------
//          public static void main(String[]args){
//
//              System.out.println("Bonjour, quel est votre prénom ?");
//              Scanner scanner = new Scanner(System.in);
//              String prenom = scanner.nextLine();
//              System.out.println("Bonjour, " + prenom);


// -------------------------------------------------5.1----------------------------------------------------------------
//                public static void main(String[] args) {
//                 maFonction();
//                 }
//                 public static void maFonction() {
//
//                     Scanner scanner = new Scanner(System.in);
//
//                     System.out.println("Veuillez saisir le premier entier");
//                     int premierEntier = scanner.nextInt();
//
//                     System.out.println("Veuillez saisir le deuxieme entier");
//                     int deuxiemeEntier = scanner.nextInt();
//
//                     int somme = premierEntier + deuxiemeEntier;
//                     System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier + " est egale a " + somme);

// --------------------------------------------------5.2----------------------------------------------------------------
            public static void main(String[] args) {
                division();
}
            public static void division() {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Veuillez saisir le premier entier");
                int premierEntier = scanner.nextInt();

                System.out.println("Veuillez saisir le deuxieme entier");
                int deuxiemeEntier = scanner.nextInt();

                if (deuxiemeEntier == 0){
                    System.out.println("Le diviseur ne peut être 0");
                }else {

                int quotient = premierEntier / deuxiemeEntier;
                System.out.println("Le quotient de " + premierEntier + " divisé par " + deuxiemeEntier + " est egale a " + quotient);}


//--------------------------------------------------5.3----------------------------------------------------------------
//                 public static void main(String[] args) {
//                        volume();
//       }
//
//                  public static void  volume() {
//                        Scanner scanner = new Scanner(System.in);
//
//                        System.out.println("Voulez-vous calculer le volume de \n 1. un rectangle \n 2. un carré ?");
//                        int forme = scanner.nextInt();
//
//                        if (forme == 1){
//                        System.out.println("Veuillez saisir la longueur du premier bord.");
//                        float l1 = scanner.nextFloat();
//
//                        System.out.println("Veuillez saisir la longueur du deuxième bord.");
//                        float l2 = scanner.nextFloat();
//
//                        System.out.println("Veuillez saisir la longueur du troisième bord.");
//                        float l3 = scanner.nextFloat();
//
//                        float vol = l1 * l2 * l3;
//                        System.out.println("Le volume est " + vol);
//
//                        }else if (forme == 2){
//
//                            System.out.println("Veuillez saisir la longueur du bord.");
//                            float l = scanner.nextFloat();
//
//                            float vol = l * l * l;
//                            System.out.println("Le volume est " + vol);
//                        }else {
//                            System.out.println("Veuillez saisir 1 ou 2.");
//                        }

       }
   }

