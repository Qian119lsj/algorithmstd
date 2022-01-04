/*
 * Copyright
 */
package algorithm.class02;

/**
 * @author Bao.f
 * @version V1.0
 */
public class Code01_ReverseList {
    public static class Node{
        public int value;
        public Node next;
        public Node(int value) {
            this.value = value;
        }
    }

    public static class DoubleNode{
        public int value;
        public DoubleNode last;
        public DoubleNode next;

        public DoubleNode(int value) {
            this.value = value;
        }
        public DoubleNode(int value,DoubleNode last) {
            this.last = last;
            this.value = value;
        }

        @Override
        public String toString() {
            return "DoubleNode{" +
                    "value=" + value +
                    ", last=" + (last!=null?last.value+"":"null") +
                    ", next=" + (next!=null?next.value+"":"null") +
                    '}';
        }
    }

    /**
     * 反转单链表
     * @param head
     * @return
     */
    public static Node reverseLinkedList(Node head) {
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    /**
     * 反转双向链表
     * @param head
     * @return
     */
    public static DoubleNode reverseDoubleLinkedList(DoubleNode head) {
        DoubleNode pre = null;
        DoubleNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;

            head.last = next;

            pre = head;//这个就是下一次循环的pre
            head = next;//这个就是下一次循环的节点
        }
        return pre;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        Node reversed = reverseLinkedList(node);
        System.out.println(reversed.value+","+reversed.next.value+","+reversed.next.next.value);

        DoubleNode node2 = new DoubleNode(1);
        node2.next = new DoubleNode(2,node2);
        node2.next.next = new DoubleNode(3,node2.next);
        DoubleNode reversed2 = reverseDoubleLinkedList(node2);
        System.out.println(reversed2+","+reversed2.next+","+reversed2.next.next);
    }
}
