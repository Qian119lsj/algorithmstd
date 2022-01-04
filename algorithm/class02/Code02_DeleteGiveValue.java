/*
 * Copyright
 */
package algorithm.class02;

/**
 * @author Bao.f
 * @version V1.0
 */
public class Code02_DeleteGiveValue {

    public static class Node{
        public int value;
        public Node next;
        public Node(int value) {
            this.value = value;
        }
    }

    public static Node deleteByValue(Node head, int value) {
        while (head.value == value) {
            head = head.next;
        }
        Node af = head;

        Node pre = head;
        head = head.next;
        while (head != null) {
            if (head.value == value)
                pre.next = head.next;
            else
                pre = head;
            head = head.next;
        }
        return af;
    }

    public static void main(String[] args) {

        Node node = new Node(1);
        node.next = new Node(1);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        node.next.next.next.next.next = new Node(5);
        node.next.next.next.next.next .next = new Node(6);
        Node node1 = deleteByValue(node, 5);

        while (node1 != null) {
            System.out.println(node1.value);
            node1 = node1.next;
        }
    }
}
