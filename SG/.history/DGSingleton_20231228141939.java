public final class DGSingleton {
    private static DGSingleton instance;
    private DGSingleton() {

    }
    public static DGSingleton getInstance(){
        if(instance == null){
            instance = new DGSingleton();
        }
        return instance;
    }
}