package creationmode.singleton;

public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
        // 私有化构造方法
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
