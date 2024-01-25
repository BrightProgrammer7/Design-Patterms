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
        DGSingleton dgs2 = new DGSingleton();
        System.out.println(DGSingleton.getInstance()); 
        //DGSingleton@3a079870
        System.out.println(DGSingleton.getInstance()); //DGSingleton@3a079870
        System.out.println(dgs2.getSingleton()); //DGSingleton@3a079870
    }

    public static DGSingleton getSingleton() {
        return DGSingleton.getInstance();
        // System.out.println(DGSingleton.getInstance());
    }
}