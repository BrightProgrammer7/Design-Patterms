public class AdapterDemo {
    public static void main(String[] args) {
        Shape s = new RectangleAdapter(new Rectangle());
        r.draw(1, 2, 3, 4);
        System.out.println(r);
    }
}
