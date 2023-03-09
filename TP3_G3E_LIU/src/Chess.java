import javax.swing.plaf.BorderUIResource;
import java.util.Scanner;
public class Chess {
    private Cell[][] board;
    private Player[] players;
    private Player currentPlayer;

    public void play() {  //主要流程控制
        while (true) {  //游戏一直进行，除游戏结束/退出
            createPlayers();
            initialiseBoard();
            setupBoard();
            while (!isCheckMate()) { //没有被将军就一直进行游戏
                printBoard();
                String move;
                do {                    //当玩家输入指令不合理时，要求重新输入
                    move = askMove();
                } while (!isValidMove(move));
                updateBoard(move);
                switchPlayer();
            }
        }
    }


    private void createPlayers() {   //创建两个玩家
        players = new Player[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Veuillez saisir le nom du joueur " + (i + 1) + ": ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            players[i] = new Player(name, i);
        }
        currentPlayer = players[0];
    }


    private void initialiseBoard() { //初始化棋盘
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


        private void printBoard () { //打印棋盘
            System.out.println("   a b c d e f g h");
            for (int i = 0; i < 8; i++) {
                System.out.print((8 - i) + " ");
                for (int j = 0; j < 8; j++) {
                    String piece = board[i][j].getPiece() == null ? " " : board[i][j].getPiece().toString(); //棋子打印棋子，没有棋子打印null
                    System.out.print("|" + piece);
                }
                System.out.println("| " + (8 - i));
            }
            System.out.println("   a b c d e f g h");
        }


        private String askMove () {
            System.out.println(currentPlayer.getName() + ", à vous de jouer !");
            System.out.println("Veuillez saisir la pièce que vous souhaitez déplacer et la position à laquelle vous souhaitez vous déplacer,\n " +
                    "par exemple: Pc4");
            return System.console().readLine();
        }


        private boolean isCheckMate () {
//            if (1==1){   //占位，因为我连啥是将军都不知道QAQ
//                return true;
//            }
            return false;
        }

        private boolean isValidMove (String move){
//            if (1==1){
//                return true;
//            }
            return false;
        }


        private void updateBoard(String move) {

            String[] positions = move.split(" ");
            Position start = new Position(positions[0]);
            Position end = new Position(positions[1]);

            Cell startCell = board[start.getRow()][start.getCol()];
            Cell endCell = board[end.getRow()][end.getCol()];

            Piece piece = startCell.getPiece();
            endCell.setPiece(piece);
            endCell.setEmpty(false);
            startCell.removePiece();

        }


        private void switchPlayer () {
            if (currentPlayer == players[0]) {
                currentPlayer = players[1];
            } else {
                currentPlayer = players[0];
            }
        }
    private void setupBoard() {
        // 初始化黑色棋子
        board[0][0].setPiece(new Rook(new Position('a', 8), 1));
        board[0][1].setPiece(new Knight(new Position('b', 8), 1));
        board[0][2].setPiece(new Bishop(new Position('c', 8), 1));
        board[0][3].setPiece(new Queen(new Position('d', 8), 1));
        board[0][4].setPiece(new King(new Position('e', 8), 1));
        board[0][5].setPiece(new Bishop(new Position('f', 8), 1));
        board[0][6].setPiece(new Knight(new Position('g', 8), 1));
        board[0][7].setPiece(new Rook(new Position('h', 8), 1));

        // 初始化白色棋子
        board[7][0].setPiece(new Rook(new Position('a', 1), 0));
        board[7][1].setPiece(new Knight(new Position('b', 1), 0));
        board[7][2].setPiece(new Bishop(new Position('c', 1), 0));
        board[7][3].setPiece(new Queen(new Position('d', 1), 0));
        board[7][4].setPiece(new King(new Position('e', 1), 0));
        board[7][5].setPiece(new Bishop(new Position('f', 1), 0));
        board[7][6].setPiece(new Knight(new Position('g', 1), 0));
        board[7][7].setPiece(new Rook(new Position('h', 1), 0));

        // 初始化八个兵
        for (int col = 0; col < 8; col++) {
            board[1][col].setPiece(new Pawn(new Position((char)('a'+col), 8), 1));
            board[6][col].setPiece(new Pawn(new Position((char)('a'+col), 1), 0));
        }
    }

}
