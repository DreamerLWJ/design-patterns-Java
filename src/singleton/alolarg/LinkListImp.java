package singleton.alolarg;

/**
 * @Description: 这是我的一个关于链表的实现
 * @Author 罗文俊
 * @Date 2020/9/7 19:49
 */
public class LinkListImp<T> {
    // 链表头指针
    private final LNode<T> headNode;
    // 链表尾指针
    private LNode<T> tailNode;
    // 链表长度
    private int size = 0;
    // 初始化标志
    private boolean isInit = false;

    /**
     * 初始化一个空链表
     */
    public LinkListImp() {
        headNode = null;
        tailNode = null;
    }

    /**
     * 提供一个参数传入的构造方法，或者又称为构造头链表
     *
     * @param firstData
     */
    public LinkListImp(T firstData) {
        headNode = new LNode<>(firstData);
        tailNode = headNode;
        size = 1;
    }

    /**
     * 提供多个参数传入的构造方法
     *
     * @param initData
     */
    public LinkListImp(T... initData) {
        headNode = new LNode<>(initData[0]);
        LNode<T> tempNode = headNode;
        for (int i = 1; i < initData.length; i++) {
            // 为后续结点添加数据
            tempNode.next = new LNode<>(initData[i]);
            size++;
            // 移动结点指针
            tempNode = tempNode.next;
        }
        // 构造方法结束
    }

    /**
     * 用于捕获链表长度
     *
     * @return 返回链表的长度
     */
    private int size() {
        return size;
    }

    public void addNode(T data) {
        // 添加指定数据集到指定结点
        tailNode.next = new LNode<>(data);
    }

    public void addNode(LNode<T> lNode) {
        // 添加经外界初始化的结点
        tailNode.next = lNode;
    }

    public void removeNode(T data) {
        checkSafe();
        // 删除指定数据集的结点

    }

    /**
     * 这个方法返回的是指定结点的克隆对象。
     * 对这个对象的更改并不会影响到链表本身。
     * 如果想要修改结点的内容请使用 updateNode() 方法。
     *
     * @param data 根据指定数据集找到对应结点
     * @return 返回的结点
     */
    public LNode<T> getNode(T data) {
        checkSafe();
        // 为了安全设置
        try {
            return get(data).clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("克隆对象失败！");
            e.printStackTrace();
        }
        return null;
    }

    public LNode<T> getNode(int index) {
        checkSafe();
        // 安全使用克隆对象
        try {
            return get(index).clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("克隆对象失败！");
            e.printStackTrace();
        }
        return null;
    }

    private LNode<T> get(int index) {
        if (index > size - 1) {
            // 抛出异常
            throw new IndexOutOfBoundsException("your are trying to access a non-exists node." +
                    "LinkList size:" + size + " index:" + index);
        }
        LNode<T> tempNode = headNode;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.next;
        }
        return tempNode;
    }

    private LNode<T> get(T data) {
        LNode<T> tempNode = headNode;
        LNode<T> result = null;
        do {
            if (tempNode.data == data) {
                result = tempNode;
            }
            tempNode.next = tempNode;
        } while (tempNode.hasNext());
        return result;
    }

    private void checkSafe() {
        if (size <= 0 || !isInit) {
            throw new IllegalStateException("The LinkList is not yet initialized or the size of the linklist is 0.");
        }
    }
}
