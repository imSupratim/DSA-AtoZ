/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Node first = head;
        Node second = head;
        while(second.next != null){
            second = second.next;
        }
        // now second is tail and first is head;
        
        while(first!=null && second!=null && first!=second && second.next!=first){
            if(first.data + second.data == target){
                ArrayList<Integer> sublist = new ArrayList<>();
                sublist.add(first.data);
                sublist.add(second.data);
                list.add(sublist);
                first=first.next;
                second = second.prev;
            }
            else if(first.data+second.data > target){
                second = second.prev;
            }
            else{
                first = first.next;
            }
        }
        return list;
    }
}
