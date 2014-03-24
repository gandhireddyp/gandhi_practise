package designpatters.java.singleton;

public class SingletonEager {

    private static SingletonEager singletonEager = new SingletonEager();

    public static SingletonEager getInstance() {
        return singletonEager;
    }

    private SingletonEager() {

    }

}
