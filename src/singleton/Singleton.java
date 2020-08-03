package singleton;

/**
 * @Description: 这是一个单例类，它将提供一个单例模式的简单实现
 * @Author LWJ
 * @Date 2020/8/4 1:06
 */
public class Singleton {

    // 私有化的单例
    private static Singleton instance;

    private Singleton() {
        // 私有化构造方法，避免类被外部实例化
    }

    public static Singleton getInstance() {
        if (instance == null) {
            // 如果单例未被实例化，则实例化后再返回
            instance = new Singleton();
        }
        return instance;
    }
}

class Test {
    public static void main(String[] args) {
        // 创建两个演示对象
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        // 显然以下输出结果将会是相同的哈希值，即说明两者是同一对象
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}
