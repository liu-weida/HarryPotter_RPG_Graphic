public abstract class Piece {
    protected Position position;
    protected int color;

    public Piece(Position position, int color) {
        this.position = position;
        this.color = color;
    }

    public abstract boolean isValidMove(Position newPosition, Cell[][] board);

    public abstract String toString();

}
