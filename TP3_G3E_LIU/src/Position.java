public class Position {
    private char col;
    private int row;


    public Position(char column, int row) {
        this.col = column;
        this.row = row;
    }

    public Position(String position) {
        this.col = (char) (position.charAt(0) - 'a');
        this.row = Character.getNumericValue(position.charAt(1)) - 1;
    }

    public String toString() {
        return "" + col + row;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

}