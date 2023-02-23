import java.util.Scanner;
public class ASCIArt {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Veuillez entrer la largeur que vous souhaitez dessiner (doit être supérieure à 7)");
            int x = scanner.nextInt();
            System.out.println("Veuillez entrer la hauteur que vous souhaitez dessiner (doit être supérieure à 3)");
            int y = scanner.nextInt();
            printCat(y, x);
        }

        public static void printCat(int y, int x) {

            char a = (char) (124); // |
            char b = (char) (92); // \
            char c = (char) (47); // /
            char d = (char) (45); // -
            char e = (char) (48); // 0
            char f = (char) (32); //
            char g = (char) (95); // _
            char h = (char) (94); // ^

            System.out.print(a);
            System.out.print(b);
            for (int i = x-4; i>0;i--){
                System.out.print(d);
            }
            System.out.print(c);
            System.out.print(a + "\n");

            for (int j = (y-3)/2; j>0; j--){
                System.out.print(a);
                for (int jj = x-2; jj>0; jj--){
                    System.out.print(f);
                }
                System.out.print(a + "\n");
            }

            System.out.print(a);
            System.out.print(f);
            System.out.print(e);
            for (int ii = x-6; ii>0; ii--){
                System.out.print(g);
            }
            System.out.print(e);
            System.out.print(f);
            System.out.print(a + "\n");

            for (int iii = y-((y-3)/2)-3; iii>0; iii--){
                System.out.print(a);
                for (int jj = x-2; jj>0; jj--){
                    System.out.print(f);
                }
                System.out.print(a + "\n");
            }
            System.out.print(b);
            System.out.print(g);
            for (int jjj = x-4; jjj>0; jjj--){
                System.out.print(h);
            }
            System.out.print(g);
            System.out.print(c + "\n");
            }
        }

