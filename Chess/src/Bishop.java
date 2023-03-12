public class Bishop extends Piece {
    public Bishop(Position position, int color) {
        super(position, color);
    }

    public boolean isValidMove(Position newPosition, Cell[][] board) {

        return true;
        //return false;
    }

    public String toString() {
        return color == 0 ? "B" : "b";
    }
}
