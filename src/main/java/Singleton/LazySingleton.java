package Singleton;

public class LazySingleton {

    private static LazySingleton instanse;

    private LazySingleton() {

    }

    public static synchronized LazySingleton getInstance() {
        if(instanse == null){
            instanse = new LazySingleton();
        }
        return instanse;
    }

}
