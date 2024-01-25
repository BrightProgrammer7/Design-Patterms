public class Personne {
    public static void main(String[] args) {
        DocumentFactory d = new DocumentFactory1();

        System.out.println("Hello Design Patterns");
        Article a1 = d.getArticle();
        a1.Display();

        Livre l1 = d.getLivre();
        l1.Display();
    }
}
