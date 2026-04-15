class Node
{
    int data;
    Node next;
}

class Solution {
    public static void removeLoop(Node head) {
        // code here
        Node slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow=slow.next;
                    fast = fast.next;
                }
                
                Node loopStart = slow;
                Node ptr = loopStart.next;
                while(ptr.next != loopStart){
                    ptr = ptr.next;
                }
                ptr.next = null;
            }
        }
    }
}





public class Main {
    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node();
        head.data = 1;
        head.next = new Node();
        head.next.data = 2;
        head.next.next = new Node();
        head.next.next.data = 3;
        head.next.next.next = new Node();
        head.next.next.next.data = 4;
        head.next.next.next.next = new Node();
        head.next.next.next.next.data = 5;

        // Create a loop: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        // Detect and remove loop
        Solution.removeLoop(head);

        // Print list after removing loop
        printList(head);
    }

    // Utility method to print linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
