public abstract class Piece { //定义棋子的属性（位置，颜色）
    protected Position position;
    protected int color;

    public Piece(Position position, int color) {  //构造方法
        this.position = position;
        this.color = color;
    }

    //public abstract boolean isValidMove(Position newPosition, Cell[][] board);
    public abstract boolean isValidMove(Position Position,Position newPosition, Cell[][] board);

    public abstract String toString();

    public int getColor() {
        return color;
    }
}
