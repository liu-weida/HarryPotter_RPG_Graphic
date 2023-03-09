public class Cell { //定义棋盘中的每一个位置
    private final Position position;
    private boolean isEmpty;
    private Piece piece;

    public Cell(Position position) {//初始化
        this.position = position;
        this.isEmpty = true;
        this.piece = null;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) { //设置是否为空
        isEmpty = empty;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Position getPosition() {
        return position;
    }

    public void removePiece() { //棋子移动之后，位置为空，棋子为null
        this.piece = null;
        this.isEmpty = true;
    }
}