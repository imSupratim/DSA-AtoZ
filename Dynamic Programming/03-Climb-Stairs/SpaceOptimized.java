import java.util.Scanner;

public class SpaceOptimized {
    public static void main(String[] args) {
        int prev1 = 1;
        int prev2 = 1;
        int curr = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n == 0 || n == 1) {
            System.out.println(1);
            return;
        }

        for(int i = 2; i<=n; i++){
            curr = prev1+prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        System.out.println(prev1);

    }
}
