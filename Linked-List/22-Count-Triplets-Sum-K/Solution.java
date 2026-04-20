import java.util.* ;
import java.io.*; 
/****************************************************************

        Following is the class structure of the Node class:

        class DLLNode
        {
         	int data;
        	DLLNode next;
       		DLLNode prev;
        }

*****************************************************************/



public class Solution {
    public static int countPairs(DLLNode first, DLLNode second, int x){
        int count = 0;
        while(first!=null && second!=null && first!=second && second.next != first){
            if(first.data+second.data == x){
                count++;
                first = first.next;
                second = second.prev;
            }
            else if(first.data+second.data>x){
                second = second.prev;
            }
            else{
                first = first.next;
            }
        }

        return count;
    }

    public static int countTriplets(DLLNode head,int x){
        // Write your code here
        if(head == null){
            return 0;
        }
        DLLNode current, first, last;
        int count = 0;
        
        last = head;
        while(last.next != null){
            last=last.next;
        }

        for(current = head; current!=null; current = current.next){
            first = current.next;
            count+=countPairs(first, last, x-current.data);
        }
        return count;

    }
}