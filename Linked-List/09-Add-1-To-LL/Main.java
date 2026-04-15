
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

class Solution {
    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    public Node addOne(Node head) {
        // code here.
        Node newHead = reverse(head);
        Node curr = newHead;
        int carry = 1;
        
        while(curr != null){
            int sum = curr.data + carry;
            curr.data = sum%10;
            carry = sum/10;
            
            if(curr.next==null && carry >0){
                curr.next = new Node(carry);
                carry = 0;
            }
            curr = curr.next;
        }
        
        return reverse(newHead);
        
    }
}