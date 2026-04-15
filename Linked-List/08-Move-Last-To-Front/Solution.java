class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class Solution {
    public static Node moveToFront(Node head) {
        // code here
        Node prev = head;
        Node node = prev.next;
        while (node.next != null) {
            prev = prev.next;
            node = node.next;
        }
        prev.next = null;
        node.next = head;
        head = node;

        return head;
    }
}
