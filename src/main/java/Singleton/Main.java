package Singleton;

public class Main {
    public static void main(String[] args) {
        SimpleSingleton instance = SimpleSingleton.getInstance();
        System.out.println(instance);

        SimpleSingleton instance2 = SimpleSingleton.getInstance();
        System.out.println(instance2);
    }
}
