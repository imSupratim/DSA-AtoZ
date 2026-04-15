// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.


import java.util.*;

class Solution{
    static int maxProfit(int[] prices){
        if(prices == null || prices.length<2){
            return 0;
        }

        int buyPrice = prices[0];
        int profit = 0;

        for(int i = 0; i<prices.length; i++){
            int currentProfit = prices[i] - buyPrice;

            profit = Math.max(profit ,currentProfit);

            buyPrice = Math.min(buyPrice, prices[i]);
        }

        return profit;
    }
}

public class Main {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int profit = Solution.maxProfit(prices);

        System.out.println("Maximum profit can be achieved is: "+profit);
    }
}