public class Pawn extends Piece {
    public Pawn(Position position, int color) {
        super(position, color);
    }

    public boolean isValidMove(Position Position, Position newPosition, Cell[][] board) {
        char colOld = Position.getCol();
        int rowOld = Position.getRow();

        char colNew = newPosition.getCol();
        int rowNew = newPosition.getRow();

        int colStart = colOld - 'a';
        int rowStart = rowOld - 1;
        int colEnd = colNew - 'a';
        int rowEnd = rowNew - 1;

        if ((colStart == colEnd && Math.abs(rowEnd - rowStart) == 1)||(Math.abs(rowEnd - rowStart) == 1)&&Math.abs(colStart-colEnd)==1) {
            return true;
        } else {
            return false;
        }

        }


        public String toString() {
            return color == 0 ? "P" : "p";

    }
}
