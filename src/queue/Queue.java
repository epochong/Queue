package queue;

/**
 * @author wangchong
 * @date 2019/5/22 20:42
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public interface Queue<E> {
    void enqueue(E e);
    E dequeue();
    E peek();
    int getSize();
    boolean isEmpty();
}
