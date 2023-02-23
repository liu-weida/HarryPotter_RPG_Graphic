import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.InputStream;

public class SafeScanner {

//-----------------------------------------2-----------------------------------------------
//public static void main(String[] args) {
//       try {
//           Scanner sc = new Scanner(System.in);
//
//        System.out.println("What is your age?");
//        int answer = sc.nextInt();
//        System.out.printf("Your age is %d%n", answer);
//        sc.close();
//        }catch (InputMismatchException e){
//           Scanner sc = new Scanner(System.in);
//
//           System.out.println("What is your age?");
//           int answer = sc.nextInt();
//           System.out.printf("Your age is %d%n", answer);
//       }
//    }
// }
//-----------------------------------------3-----------------------------------------------
//public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your age?");
//
//        while (!sc.hasNextInt()) {
//            System.out.println("What is your age?");
//            sc.next();
//        }
//
//        int answer = sc.nextInt();
//        System.out.printf("Your age is %d%n", answer);
//        sc.close();
//    }
// }
//-----------------------------------------4-----------------------------------------------
//public static void main(String[] args) {
//        try(Scanner sc = new Scanner(System.in)){
//            System.out.println("What is your age?");
//            int answer = sc.nextInt();
//            System.out.printf("Your age is %d%n", answer);}
//            catch(InputMismatchException e) {
//                Scanner sc = new Scanner(System.in);
//                System.out.println("What is your age?");
//                int answer = sc.nextInt();
//                System.out.printf("Your age is %d%n", answer);}
//    }
// }
//-----------------------------------------5-----------------------------------------------
//public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         boolean inputValid = false;
//         while (!inputValid) {
//                  try {
//                     System.out.println("What is your age?");
//                     answer = sc.nextInt();
//                     inputValid = true;
//                  } catch (InputMismatchException e) {
//                     System.out.println("Invalid input. Please enter an integer value.");
//                     sc.next();
//                     }
//    }
//    sc.close();
//    }
// }
//-----------------------------------------6-----------------------------------------------
//public static void main(String[] args) {
//
//
//                 Scanner sc = new Scanner(System.in);
//                 int answer = getInt(sc);
//                 System.out.printf("Your age is %d%n", answer);
//                 sc.close();
//                 }
// public static int getInt(Scanner sc){
//                 boolean inputValid = false;
//                 int answer = 0;
//                 while (!inputValid) {
//                     try {
//                        System.out.println("What is your age?");
//                        answer = sc.nextInt();
//                        inputValid = true;
//                     } catch (InputMismatchException e) {
//
//                         sc.next();
//                     }
//     }
//     return answer;
//    }
// }
//-----------------------------------------7-----------------------------------------------
//        private Scanner sc;
//
//        public SafeScanner() {
//             sc = new Scanner(System.in);
//    }
//
//        public int getInt() {
//        boolean inputValid = false;
//        int answer = 0;
//        while (!inputValid) {
//            try {
//                System.out.println("What is your age?");
//                answer = sc.nextInt();
//                inputValid = true;
//            } catch (InputMismatchException e) {
//
//                sc.next();
//            }
//        }
//        return answer;
//    }
//
//        public void closeScanner() {
//        sc.close();
//    }
//
//         public static void main(String[] args) {
//            SafeScanner scanner = new SafeScanner();
//            int answer = scanner.getInt();
//            System.out.printf("Your age is %d%n", answer);
//            scanner.closeScanner();
//    }
// }
//-----------------------------------------9-----------------------------------------------

        private Scanner sc;

        public SafeScanner(InputStream is) {
            sc = new Scanner(is);
        }

        public int getInt() {
            boolean inputValid = false;
            int answer = 0;
            while (!inputValid) {
                try {
                    System.out.println("What is your age?");
                    answer = sc.nextInt();
                    inputValid = true;
                } catch (InputMismatchException e) {

                    sc.next();
                }
            }
            return answer;
        }

        public void closeScanner() {
            sc.close();
        }

        public static void main(String[] args) {
            SafeScanner scanner = new SafeScanner(System.in);
            int answer = scanner.getInt();
            System.out.printf("Your age is %d%n", answer);
            scanner.closeScanner();
        }
    }






