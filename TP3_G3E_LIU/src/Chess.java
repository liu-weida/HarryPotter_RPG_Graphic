import java.util.Scanner;
public class Chess {
    private Cell[][] board;
    private Player[] players;
    private Player currentPlayer;

    public void play() {
        while (true) {
            createPlayers();
            initialiseBoard();
            while (!isCheckMate()) {
                printBoard();
                String move;
                do {
                    move = askMove();
                } while (!isValidMove(move));
                updateBoard(move);
                switchPlayer();
            }
        }
    }


    private void createPlayers() {
        players = new Player[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter name of player " + (i + 1) + ": ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            players[i] = new Player(name, i);
        }
        currentPlayer = players[0];
    }


    private void initialiseBoard() {
        board = new Cell[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char Col = (char) ('a' + j);
                int Row = 8 - i;
                Position position = new Position(Col, Row);
                board[i][j] = new Cell(position);
                board[i][j].setPiece(null);
            }
        }
    }


        private void printBoard () {
            System.out.println("  a b c d e f g h");
            for (int i = 0; i < 8; i++) {
                System.out.print((8 - i) + " ");
                for (int j = 0; j < 8; j++) {
                    String piece = board[i][j].getPiece() == null ? " " : board[i][j].getPiece().toString();
                    System.out.print("|" + piece);
                }
                System.out.println("| " + (8 - i));
            }
            System.out.println("  a b c d e f g h");
        }


        private String askMove () {
            System.out.println(currentPlayer.getName() + ", à vous de jouer !");
            System.out.println("Veuillez saisir la pièce que vous souhaitez déplacer et la position à laquelle vous souhaitez vous déplacer,\n " +
                    "par exemple: Pc4");
            return System.console().readLine();
        }


        private boolean isCheckMate () {
            // À compléter
            return false;
        }


        private boolean isValidMove (String move){
            // À compléter
            return false;
        }


        private void updateBoard(String move) {
            // À compléter

        }


        private void switchPlayer () {
            if (currentPlayer == players[0]) {
                currentPlayer = players[1];
            } else {
                currentPlayer = players[0];
            }
        }
    }
