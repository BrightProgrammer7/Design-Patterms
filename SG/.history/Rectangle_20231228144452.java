public class Rectangle {
    public void draw(int x, int y, int width, int height) {
        System.out.println(
                "Rectangle with coordinate down point(" + x + ")=" + y + "), width:" + width + " height:" + height);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.draw(1, 2, 3, 0);
    }
}
