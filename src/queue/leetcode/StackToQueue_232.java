package queue.leetcode;

import java.util.Stack;

/**
 * @author wangchong
 * @date 2019/5/23 14:42
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class StackToQueue_232 {
    Stack<Integer> pushStack = new Stack<>();
    Stack<Integer> popStack = new Stack<>();
    /** Initialize your data structure here. */

    /** Push element x to the back of queue. */
    public void push(int x) {
        pushStack.push(x);

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (popStack.empty() && pushStack.empty()) {
            throw new RuntimeException("Queue is empty!");
        } else if (popStack.empty()) {
            while (!pushStack.empty()) {
                popStack.push(pushStack.pop());
            }
        }
        return popStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (popStack.isEmpty() && pushStack.isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        } else if (popStack.isEmpty()) {
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }
        return popStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if (popStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
