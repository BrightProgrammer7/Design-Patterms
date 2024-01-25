public final class DGSingleton {
    private static DGSingleton instance;

    private DGSingleton() {

    }

    public static DGSingleton getInstance() {
        if (instance == null) {
            instance = new DGSingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        DGSingleton dgs = new DGSingleton();
        // DGSingleton dgs2 = new DGSingleton();
        // System.out.println(dgs1);
        System.out.println(DGSingleton.getInstance()); //Z:\GL\SG\DGSingleton.java
        System.out.println(dgs.getInstance());
        System.out.println(dgs.getSingleton());
    }

    public static DGSingleton getSingleton() {
        return DGSingleton.getInstance();
        // System.out.println(DGSingleton.getInstance());
    }
}