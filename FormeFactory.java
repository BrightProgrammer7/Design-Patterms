public class FormeFactory {
    public Forme getForme(String FormeType) {
        if (FormeType == null) {
            return null;
        }
        if (FormeType.equalsIgnoreCase("CERCLE")) {
            return new Cercle();
        } else if (FormeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else {
            return null;
        }

    }
}
