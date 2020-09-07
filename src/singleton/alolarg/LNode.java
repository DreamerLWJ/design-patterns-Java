package singleton.alolarg;

/**
 * @Description: TODO(请添加描述)
 * @Author 11740
 * @Date 2020/9/7 19:48
 */
public class LNode<T> {
    public T data;
    public LNode<T> next;

    public LNode(T data) {
        this.data = data;
    }

    // 用于更新节点信息
    public void update(T data) {
        this.data = data;
    }

    /**
     * 该方法用于返回该结点是否存在后继结点
     * @return  布尔值表示是否有后继节点
     */
    public boolean hasNext() {
        return next != null;
    }

    @Override
    protected LNode<T> clone() throws CloneNotSupportedException {
        return (LNode<T>) super.clone();
    }
}
