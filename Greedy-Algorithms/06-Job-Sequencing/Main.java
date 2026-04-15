import java.util.*;


class Solution {
    static class Job {
        int deadline, id, profit;

        Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    static class JobProfitComparator implements Comparator<Job> {
        @Override
        public int compare(Job a, Job b) {
            return b.profit - a.profit;
        }
    }

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        ArrayList<Job> jobs = new ArrayList<>();
        int n = deadline.length;
        int jobDone = 0;
        int totalProfit = 0;

        for (int i = 0; i < n; i++) {
            jobs.add(new Job(i + 1, deadline[i], profit[i]));
        }

        Collections.sort(jobs, new JobProfitComparator());

        int maxDeadLine = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            maxDeadLine = Math.max(maxDeadLine, deadline[i]);
        }

        int slots[] = new int[maxDeadLine + 1];

        Arrays.fill(slots, -1);

        for (Job job : jobs) {
            for (int j = job.deadline; j > 0; j--) {
                if (slots[j] == -1) {
                    slots[j] = job.id;
                    jobDone++;
                    totalProfit += job.profit;
                    break;
                }
            }

        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(jobDone);
        result.add(totalProfit);

        return result;

    }
}



public class Main {
    public static void main(String[] args) {
        
        Solution sol = new Solution();
        
        // Example input
        int[] deadline = {2, 1, 2, 1, 3};
        int[] profit   = {100, 19, 27, 25, 15};
        
        ArrayList<Integer> result = sol.jobSequencing(deadline, profit);
        
        System.out.println("Jobs done: " + result.get(0));
        System.out.println("Total profit: " + result.get(1));
    }
}