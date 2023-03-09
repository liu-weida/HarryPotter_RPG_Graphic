public class Player {   //定义玩家的姓名和颜色
    private String name;
    private int color;

    public Player(String name, int color) {   //构造方法,初始化
        this.name = name;
        this.color = color;
    }

    public String getName() {

        return this.name;
    }

    public int getColor() {

        return this.color;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setColor(int color) {

        this.color = color;
    }
}
