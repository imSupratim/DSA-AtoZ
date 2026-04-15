import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();

        int prev2 = 0;
        int prev = 1;
        int curr = 0;
        for(int i=2; i<=n; i++){
            curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }       
        System.out.println("result is: "+prev);
    }    
}
