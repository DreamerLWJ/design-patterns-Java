package creationmode.singleton;

public class LazySingleton {
    private static volatile LazySingleton instance;

    private LazySingleton(){
        // 私有化构造方法
    }

    // 保持线程同步
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
