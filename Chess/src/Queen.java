public class Queen extends Piece {
    public Queen(Position position, int color) {
        super(position, color);
    }
    public boolean isValidMove(Position newPosition, Cell[][] board) {

        return false;
    }

    public String toString() {
        return color == 0 ? "Q" : "q";
    }
}
