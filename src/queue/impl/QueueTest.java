package queue.impl;

import queue.Queue;

/**
 * @author wangchong
 * @date 2019/5/22 20:55
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.enqueue(1);
        queue.enqueue(1);
        queue.enqueue(1);
        queue.enqueue(1);
        queue.enqueue(1);
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.getSize());
        System.out.println(queue.isEmpty());
        System.out.println(queue);

    }
}
