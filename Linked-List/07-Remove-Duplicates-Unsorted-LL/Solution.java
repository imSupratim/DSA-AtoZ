import java.util.*;
import java.io.*;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class Solution {

    public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {

        // Write your code here
        HashSet<Integer> set = new HashSet<>();
        LinkedListNode<Integer> node = head;
        LinkedListNode<Integer> prev = null;

        while (node != null) {
            if (set.contains(node.data)) {
                prev.next = node.next;
            } else {
                set.add(node.data);
                prev = node;
            }
            node = node.next;
        }

        return head;
    }

}