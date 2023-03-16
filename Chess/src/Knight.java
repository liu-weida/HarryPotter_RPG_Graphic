public class Knight extends Piece {
    public Knight(Position position, int color) {
        super(position, color);
    }
    public boolean isValidMove(Position Position,Position newPosition, Cell[][] board) {
        char colOld = Position.getCol();
        int rowOld = Position.getRow();

        char colNew = newPosition.getCol();
        int rowNew = newPosition.getRow();

        int colStart = colOld - 'a';
        int rowStart = rowOld - 1;
        int colEnd = colNew - 'a';
        int rowEnd = rowNew - 1;

        if ((Math.abs(colStart-colEnd)==2 && Math.abs(rowStart-rowEnd)==1)
            ||Math.abs(colStart-colEnd)==1 && Math.abs(rowStart-rowEnd)==2){
            return true;
        }else {
            return false;
        }

    }

    public String toString() {
        return color == 0 ? "N" : "n";
    }
}
