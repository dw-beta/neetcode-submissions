// Set buy price to the first index's value
// Set max profit to 0
// Iterate through the array starting from second index
// Compare is current price cheaper than buy price?
// If cheaper set current price as buy price
// Calculate profit

class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }
            else {
                int profit = prices[i] - buyPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
