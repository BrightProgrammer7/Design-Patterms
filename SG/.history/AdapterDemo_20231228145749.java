public class AdapterDemo {
    public static void main(String[] args) {
        Shape s = new RectangleAdapter(new Rectangle());
        s.draw(10, 30, 20, 4);
        System.out.println(s);
    }
}
