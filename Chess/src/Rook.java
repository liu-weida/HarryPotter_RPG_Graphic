public class Rook extends Piece {
    public Rook(Position position, int color) {
        super(position, color);
    }

    public boolean isValidMove(Position newPosition, Cell[][] board) {

        return true;
        //return false;
    }

    public String toString() {
        return color == 0 ? "R" : "r";
    }
}
