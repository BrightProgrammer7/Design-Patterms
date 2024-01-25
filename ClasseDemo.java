public class ClasseDemo {

    public static void main(String[] args) {
        FormeFactory f = new FormeFactory();

        System.out.println("hello Design Patterns");
        Forme forme1 = f.getForme("Cercle");
        forme1.draw();

        Forme forme2 = f.getForme("Rectangle");
        forme2.draw();
    }
}
