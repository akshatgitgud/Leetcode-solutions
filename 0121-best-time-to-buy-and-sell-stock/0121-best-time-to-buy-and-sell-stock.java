class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = prices[0];
        int n = prices.length;
        for (int i = 1; i < n; i++) {
            int currentProfit = prices[i]-minPrice;
            profit = Math.max(profit, currentProfit);
            minPrice = Math.min(minPrice, prices[i]); 
            //This is how i could maintain a day where stock costs minimum in order to buy it 
            // Rather than going to a complexity of O(n^2)
        }
        return profit;
    }
    }
