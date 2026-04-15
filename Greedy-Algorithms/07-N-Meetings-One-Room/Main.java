import java.util.*;

class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    class Meetings{
        int startTime;
        int endTime;
        int position;
        
        Meetings(int startTime, int endTime, int position){
            this.startTime = startTime;
            this.endTime = endTime;
            this.position = position;
        }
    }
    
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        int count = 1; //as the first job is always going to execute
        int n = start.length;
        Meetings[] arr = new Meetings[n];
        
        for(int i = 0; i<n; i++){
            arr[i] = new Meetings(start[i], end[i], i);
        }
        
        Arrays.sort(arr, (a, b)->Integer.compare(a.endTime, b.endTime));
    
        int freeTime = arr[0].endTime;
        for(int i=1; i<n; i++){
            if( arr[i].startTime > freeTime ){
                count++;
                freeTime = arr[i].endTime;
            }
        }
        
        return count;
    }
}

public class Main{
    public static void main(String[] args) {
        // 1. Create an instance of the outer class
        Solution solver = new Solution();

        // 2. Define test data
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        // 3. Call the function and print the result
        int result = solver.maxMeetings(start, end);
        
        System.out.println("Maximum number of meetings: " + result);
        
        // Expected Output for this case: 4 
        // (Meetings: [1,2], [3,4], [5,7], [8,9])
    }
}