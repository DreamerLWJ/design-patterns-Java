package creationmode.prototype;

/**
 * @author 罗文俊
 *
 * 原型设计模式：
 * 用一个已经创建的实例作为原型，通过赋值该原型对象来创建一个和原型相同或相似的对象。
 * 优点：
 * 1. Java 自带的原型模式基于内存二进制流的赋值，在性能上要比直接 new 一个对象更加好
 * 2. 可以使用深克隆方式保存对象的状态，使用原型模式将对象赋值一份，并将其状态保存起来，
 * 简化了创建对象的过程，以便在需要的使用使用（例如恢复到历史某一状态）
 *
 * 下面是一个实现原型模式的类
 */
public class Prototype implements Cloneable{
    public Prototype() {
        System.out.println("具体原型创建成功！");
    }

    /**
     * 这是原型类用于克隆产生新对象的核心方法
     * @return 返回克隆产生的新对象
     * @throws CloneNotSupportedException
     * 如果一个类没用实现 Cloneable 接口，此处将引发异常
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("克隆成功！");
        return super.clone();
    }
}

class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype obj1 = new Prototype();
        // 通过克隆产生新的对象
        Prototype obj2 = (Prototype) obj1.clone();
        System.out.println("两个对象是否是同一个对象？" + (obj1 == obj2));
    }
}
