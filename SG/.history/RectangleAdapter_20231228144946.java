public class RectangleAdapter implements Shape {
    private Rectangle adaptee;
    public RectangleAdapter(Rectangle r){
        this.adaptee = r
    }
    @Override
    public void draw(int x, int y, int z, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'draw'");
    }
}
