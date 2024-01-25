public class AdapterDemo {
    public static void main(String[] args) {
        Shape s = new RectangleAdapter(new Rectangle());
        s.draw(1, 2, 3, 4);
        System.out.println(s);
    }
}
