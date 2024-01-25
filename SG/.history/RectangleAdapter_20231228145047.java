public class RectangleAdapter implements Shape {
    private Rectangle adaptee;
    public RectangleAdapter(Rectangle r){
        this.adaptee = r;
    }
    @Override
    public void draw(int x, int y, int z, int j) {
        int p = Math.min(x, z);
        int y = Math.min(y, j);



    }
}
