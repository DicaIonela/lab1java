public class Punct {
    private int x;
    private int y;

    public Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punct() {
        this.x=0;
        this.y=0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x +", " + y +')';
    }
    public double distanta(Punct p)
    {
        return Math.sqrt(Math.pow((p.getX()-this.getX()),2)+Math.pow((p.getY()-this.getY()),2));
    }
}
