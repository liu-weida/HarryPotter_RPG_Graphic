import java.util.Scanner;
public class Chess {
    private Cell[][] board;
    private Player[] players;
    private Player currentPlayer;

    public void play() {  //主要流程控制 Contrôles clés des processus
        while (true) {
            createPlayers();
            initialiseBoard();
            setupBoard();
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


    private void createPlayers() {   //创建两个玩家 Créer deux joueurs
        players = new Player[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Veuillez saisir le nom du joueur " + (i + 1) + ": ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            players[i] = new Player(name, i);
        }
        currentPlayer = players[0];
    }


    private void initialiseBoard() { //初始化棋盘 Initialisation de la carte
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


        private void printBoard () { //打印棋盘 Échiquier imprimé
            System.out.println("   a b c d e f g h");
            for (int i = 0; i < 8; i++) {
                System.out.print((i+1)+ " ");
                for (int j = 0; j < 8; j++) {
                    String piece = board[i][j].getPiece() == null ? " " : board[i][j].getPiece().toString(); //棋子打印棋子，没有棋子打印null
                    System.out.print("|" + piece);
                }
                System.out.println("| " + (i+1));
            }
            System.out.println("   a b c d e f g h");
        }


    private String askMove() {
        String move;
        boolean validInput;
        System.out.println(currentPlayer.getName() + ", à vous de jouer !");
        System.out.println("Veuillez saisir la pièce que vous souhaitez déplacer, la position de départ de la pièce " +
                "et la position à laquelle vous souhaitez vous rendre.\n " +
                "Par exemple: P"+"a"+"2"+"a"+"3");
        Scanner scanner = new Scanner(System.in);
        move = scanner.nextLine();
        String[] moveArr = move.split("");
        if (moveArr.length != 5 || !moveArr[0].matches("[KQNRBPkqnrbp]") || !moveArr[1].matches("[a-h]") ||
                !moveArr[2].matches("[1-8]") || !moveArr[3].matches("[a-h]") || !moveArr[4].matches("[1-8]")) {
                 validInput = false;
                 System.out.println("Entrée invalide. Veuillez saisir une entrée de la forme Pa2a3.");
        } else {
            validInput = true;
        }

        while (!validInput) {
            scanner = new Scanner(System.in);
            move = scanner.nextLine();
            moveArr = move.split("");
            if (moveArr.length != 5 || !moveArr[0].matches("[KQNRBPkqnrbp]") || !moveArr[1].matches("[a-h]") ||
                    !moveArr[2].matches("[1-8]") || !moveArr[3].matches("[a-h]") || !moveArr[4].matches("[1-8]")) {
                System.out.println("Entrée invalide. Veuillez saisir une entrée de la forme Pa2a3.");
            } else {
                validInput = true;
            }
        }
        return move;
    }


        private boolean isCheckMate () {//验证king是否还在场  Vérifiez que King est toujours présent

            boolean isK = false;
            boolean isk = false;
            for (int i = 0; i < 8; i++) { //验证‘K’是否在场 Vérifier la présence de ‘K’
                for (int j = 0; j < 8; j++) {
                    Cell cell = board[i][j];
                    if (cell != null && cell.getPiece() != null) {
                        String piece = cell.getPiece().toString();
                        char king = piece.charAt(0);
                        if (king == 'K') {
                            isK = true;
                        }
                    }
                }
            }
            for (int ii = 0; ii < 8; ii++) {//验证‘k’是否在场 Vérifier la présence de ‘k’
                for (int jj = 0; jj < 8; jj++) {
                    Cell cell = board[ii][jj];
                    if (cell != null && cell.getPiece() != null) {
                        String piece = cell.getPiece().toString();
                        char king = piece.charAt(0);
                        if (king == 'k') {
                            isk = true;
                        }
                    }
                }
            }
            if (!isk || !isK){
                if (!isk){
                    System.out.println("Le jeu est terminé !\n" + "Le gagnant est : JOUEUR 1 !!!");
                    System.out.println("Le prochain match est sur le point de commencer.");
                    System.out.println("-------------------------------------------------");
                    System.out.println("--------------------Échecs-----------------------");
                    System.out.println("-------------------------------------------------");
                    return true;
                }
                if (!isK){
                    System.out.println("Le jeu est terminé !\n" + "Le gagnant est : JOUEUR 2 !!!");
                    System.out.println("Le prochain match est sur le point de commencer.");
                    System.out.println("-------------------------------------------------");
                    System.out.println("--------------------Échecs-----------------------");
                    System.out.println("-------------------------------------------------");
                    return true;
                }
            }

            return false;
        }


        private boolean isValidMove (String move){ //验证棋子的移动是否合理 Vérifiez que le mouvement des pièces est logique
                                //因为我完全不会下国际象棋，所以也不知道该怎么验证棋子的移动是否合理，所以现在棋子可以无视规则运动
                                //Comme je ne joue pas du tout aux échecs, je ne sais pas comment vérifier que le mouvement des pièces est logique,
                                    // de sorte que les pièces peuvent maintenant se déplacer sans tenir compte des règles.

                String[] positions = move.split("");
            char piece = positions[0].charAt(0);
            char colStart1 = positions[1].charAt(0); // 起始位置 Position de départ
            int rowStart1 = Integer.parseInt(positions[2]);
            char colEnd1 = positions[3].charAt(0); // 最终位置 Position final
            int rowEnd1 = Integer.parseInt(positions[4]);
            int colStart = colStart1 - 'a';
            int rowStart = rowStart1 - 1;
            int colEnd = colEnd1 - 'a';
            int rowEnd = rowEnd1 - 1;

            String isPiece1 = board[rowStart][colStart].getPiece().toString();
            char isPiece = isPiece1.charAt(0);//判断移动的棋子是否正确 déterminer si la bonne pièce a été déplacée
                if (isPiece != piece) {
                     System.out.println("Vous avez déplacé la mauvaise pièce, veuillez la réintroduire.");
                     return false;
            }
            Piece pieceStart = board[rowStart][colStart].getPiece();
                if (pieceStart.getColor() != currentPlayer.getColor()) {//判断移动的是不是自己的棋子 Déterminer si un coup est votre propre pièce
                    System.out.println("Veuillez déplacer votre propre pièce.");
                    return false;
                }
            Piece pieceEnd = board[rowEnd][colEnd].getPiece();
                if (pieceEnd != null && pieceEnd.getColor() == currentPlayer.getColor()) {//判断目标位置有没有自己的棋子 Déterminer si la position cible possède ses propres pièces
                    System.out.println("Votre pièce existe dans cette position.");
                    return false;
                }

            Position Position = new Position(colStart1, rowStart1);
            Position newPosition = new Position(colEnd1, rowEnd1);
            boolean isValid;

            switch (piece){//判断移动是否符合规则
                case 'K':
                    Piece king = new King(Position,pieceStart.getColor());
                    isValid = king.isValidMove(newPosition, board);
                    if (!isValid) {System.out.println("Votre action n'est pas conforme aux règles du jeu, veuillez revenir.");}
                    return isValid;
                case 'Q':
                    Piece queen = new Queen(Position,pieceStart.getColor());
                    isValid = queen.isValidMove(newPosition, board);
                    if (!isValid) {System.out.println("Votre action n'est pas conforme aux règles du jeu, veuillez revenir.");}
                    return isValid;
                case 'B':
                    Piece bishop = new Bishop(Position,pieceStart.getColor());
                    isValid = bishop.isValidMove(newPosition, board);
                    if (!isValid) {System.out.println("Votre action n'est pas conforme aux règles du jeu, veuillez revenir.");}
                    return isValid;
                case 'N':
                    Piece knight = new Knight(Position,pieceStart.getColor());
                    isValid = knight.isValidMove(newPosition, board);
                    if (!isValid) {System.out.println("Votre action n'est pas conforme aux règles du jeu, veuillez revenir.");}
                    return isValid;
                case 'R':
                    Piece rook = new Rook(Position,pieceStart.getColor());
                    isValid = rook.isValidMove(newPosition, board);
                    if (!isValid) {System.out.println("Votre action n'est pas conforme aux règles du jeu, veuillez revenir.");}
                    return isValid;
                case 'P':
                    Piece pawn = new Pawn(Position,pieceStart.getColor());
                    isValid = pawn.isValidMove(newPosition, board);
                    if (!isValid) {System.out.println("Votre action n'est pas conforme aux règles du jeu, veuillez revenir.");}
                    return isValid;
                case 'k':
                    king = new King(Position,pieceStart.getColor());
                    isValid = king.isValidMove(newPosition, board);
                    if (!isValid) {System.out.println("Votre action n'est pas conforme aux règles du jeu, veuillez revenir.");}
                    return isValid;
                case 'q':
                    queen = new Queen(Position,pieceStart.getColor());
                    isValid = queen.isValidMove(newPosition, board);
                    if (!isValid) {System.out.println("Votre action n'est pas conforme aux règles du jeu, veuillez revenir.");}
                    return isValid;
                case 'b':
                    bishop = new Bishop(Position,pieceStart.getColor());
                    isValid = bishop.isValidMove(newPosition, board);
                    if (!isValid) {System.out.println("Votre action n'est pas conforme aux règles du jeu, veuillez revenir.");}
                    return isValid;
                case 'n':
                    knight = new Knight(Position,pieceStart.getColor());
                    isValid = knight.isValidMove(newPosition, board);
                    if (!isValid) {System.out.println("Votre action n'est pas conforme aux règles du jeu, veuillez revenir.");}
                    return isValid;
                case 'r':
                    rook = new Rook(Position,pieceStart.getColor());
                    isValid = rook.isValidMove(newPosition, board);
                    if (!isValid) {System.out.println("Votre action n'est pas conforme aux règles du jeu, veuillez revenir.");}
                    return isValid;
                case 'p':
                    pawn = new Pawn(Position,pieceStart.getColor());
                    isValid = pawn.isValidMove(newPosition, board);
                    if (!isValid) {System.out.println("Votre action n'est pas conforme aux règles du jeu, veuillez revenir.");}
                    return isValid;
            }

                return true;
            }



        private void updateBoard(String move) { // 更新棋盘 Mise à jour du tableau

            String[] positions = move.split("");
            char colStart1 = positions[1].charAt(0);
            int rowStart1 = Integer.parseInt(positions[2]);

            char colEnd1 = positions[3].charAt(0);
            int rowEnd1 = Integer.parseInt(positions[4]);

            int colStart = colStart1 - 'a';
            int rowStart = rowStart1 - 1;
            int colEnd = colEnd1 - 'a';
            int rowEnd = rowEnd1 - 1;

            Cell startCell = board[rowStart][colStart];
            Cell endCell = board[rowEnd][colEnd];

            Piece piece = startCell.getPiece();
            startCell.setPiece(null);
            startCell.setEmpty(true);

            endCell.setPiece(piece);
            endCell.setEmpty(false);


        }


        private void switchPlayer () {
            if (currentPlayer == players[0]) {
                currentPlayer = players[1];
            } else {
                currentPlayer = players[0];
            }
        }

    private void setupBoard() {
        // 初始化黑色棋子 Initialisation des pièces noires
        board[0][0].setPiece(new Rook(new Position('a', 8), 1));
        board[0][1].setPiece(new Knight(new Position('b', 8), 1));
        board[0][2].setPiece(new Bishop(new Position('c', 8), 1));
        board[0][3].setPiece(new King(new Position('e', 8), 1));
        board[0][4].setPiece(new Queen(new Position('d', 8), 1));
        board[0][5].setPiece(new Bishop(new Position('f', 8), 1));
        board[0][6].setPiece(new Knight(new Position('g', 8), 1));
        board[0][7].setPiece(new Rook(new Position('h', 8), 1));

        // 初始化白色棋子 Initialisation des pièces blanches
        board[7][0].setPiece(new Rook(new Position('a', 1), 0));
        board[7][1].setPiece(new Knight(new Position('b', 1), 0));
        board[7][2].setPiece(new Bishop(new Position('c', 1), 0));
        board[7][3].setPiece(new King(new Position('e', 1), 0));
        board[7][4].setPiece(new Queen(new Position('d', 1), 0));
        board[7][5].setPiece(new Bishop(new Position('f', 1), 0));
        board[7][6].setPiece(new Knight(new Position('g', 1), 0));
        board[7][7].setPiece(new Rook(new Position('h', 1), 0));

        // 初始化八个兵 Initialisation de huit pawn
        for (int col = 0; col < 8; col++) {
            board[1][col].setPiece(new Pawn(new Position((char)('a'+col), 8), 1));
            board[6][col].setPiece(new Pawn(new Position((char)('a'+col), 1), 0));
        }
    }



}
