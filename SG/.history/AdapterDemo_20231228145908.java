public class AdapterDemo {
    public static void main(String[] args) {
        Shape s = new Rectangle();
        Shape s = new RectangleAdapter(new Rectangle());
        s.draw(10, 30, 20, 60);
        System.out.println(s);
    }
}
