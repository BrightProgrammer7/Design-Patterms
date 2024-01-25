public class RectangleAdapter implements Shape {
    private Rectangle adaptee;

    public RectangleAdapter(Rectangle r) {
        this.adaptee = r;
    }

    @Override
    public void draw(int x, int y, int z, int j) {
        int p1 = Math.min(x, z);
        int p2 = Math.min(y, j);
        int w = Math.abs(y - x);
        int h = Math.abs(j - y);
        adaptee.draw(p1, p2, width, height);

    }
}
