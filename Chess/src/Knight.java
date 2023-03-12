public class Knight extends Piece {
    public Knight(Position position, int color) {
        super(position, color);
    }
    public boolean isValidMove(Position newPosition, Cell[][] board) {

        return true;
        //return false;
    }

    public String toString() {
        return color == 0 ? "N" : "n";
    }
}
