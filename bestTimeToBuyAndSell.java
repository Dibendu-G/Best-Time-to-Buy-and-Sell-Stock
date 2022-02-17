package com.company;
class Solution5 {
    int[] prices ={4,5,6,8,7,9};
    public int maxProfit() {
        int buy = prices[0];
        int profit = 0;
        for(int i =0;i<prices.length;i++)
        {
            if(buy>prices[i])
            {
                buy= prices[i];
            }
            profit = Math.max(profit,prices[i]-buy);
        }
        return profit;
    }
}
public class bestTimeToBuyAndSell {
    public static void main(String[] args) {
        Solution5 sc = new Solution5();
        System.out.println(sc.maxProfit());
    }
}
