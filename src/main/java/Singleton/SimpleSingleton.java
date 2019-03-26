package Singleton;

public class SimpleSingleton {

    private SimpleSingleton() {
        System.out.println("Привет, я простой Одиночка");
    }

    private static SimpleSingleton ourInstance = new SimpleSingleton();

    public static SimpleSingleton getInstance() {
        return ourInstance;
    }
}
