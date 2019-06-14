package queue.impl;

import queue.Queue;

/**
 * @author wangchong
 * @date 2019/5/22 20:42
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class LinkedList<E> implements Queue<E> {
    Node head;
    Node tail;
    int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    class Node {
        E element;
        Node next;

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }
    }


    @Override
    public void enqueue(E e) {
        Node newNode = new Node(e,null);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            System.out.println("队列为空");
            return null;
        }
        E tem = head.element;
        head = head.next;
        size--;
        return tem;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            System.out.println("队列为空");
            return null;
        }
        return head.element;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
