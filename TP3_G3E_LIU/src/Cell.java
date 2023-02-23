public class Cell {
    private final Position position;
    private boolean isEmpty;
    private Piece piece;

    public Cell(Position position) {
        this.position = position;
        this.isEmpty = true;
        this.piece = null;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
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

    public void removePiece() {
        this.piece = null;
        this.isEmpty = true;
    }
}