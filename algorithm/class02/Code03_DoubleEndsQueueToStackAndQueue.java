/*
 * Copyright
 */
package algorithm.class02;

/**
 * @author Bao.f
 * @version V1.0
 */
public class Code03_DoubleEndsQueueToStackAndQueue {
    public static class Node<T>{
        public T value;
        public Node<T> last;
        public Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }

    public static class DoubleEndsQueue<T>{
        public Node<T> head;
        public Node<T> tail;

        public void addFromHead(T val){
            Node<T> tNode = new Node<>(val);
            if (head == null) {
                head = tNode;
                tail = tNode;
            } else {
                tNode.next = head;
                head.last = tNode;
                head = tNode;
            }
        }
        public void addFromBottom(T val){
            Node<T> tNode = new Node<>(val);
            if (head == null) {
                head = tNode;
                tail = tNode;
            } else {
                tNode.last = tail;
                tail.next = tNode;
                tail = tNode;
            }
        }

        public T popFromHead() {
            if (head==null)
                return null;

            T v = head.value;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.last = null;
            }
            return v;

        }

        public T popFromBottom() {
            if (head ==null)
                return null;

            T v = tail.value;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail = tail.last;
                tail.next = null;
            }
            return v;
        }

        public DoubleEndsQueue(T val) {
            Node<T> tNode = new Node<>(val);
            head = tNode;
            tail = tNode;
        }

    }
}
