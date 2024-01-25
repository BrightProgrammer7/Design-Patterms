public class DocumentFactory1 implements DocumentFactory {

    @Override
    public Livre getLivre() {
        return new Livre1();
    }

    @Override
    public Article getArticle() {
        return new Article1();
    }

}
