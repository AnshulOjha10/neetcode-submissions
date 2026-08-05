class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int profit = 0;
        int n = prices.length;

        //now profit = sell - buy so sell should be greater than buy 

        for(int sell = 1; sell < n; sell++){
            if(prices[sell] < prices[buy]){
                buy = sell;
            }

            profit = Math.max(profit, prices[sell] - prices[buy]);
        }

        return profit;
    }
}
