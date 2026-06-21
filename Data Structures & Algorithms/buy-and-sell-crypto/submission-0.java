class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=Integer.MIN_VALUE;
        int profit=0;
        int buy=prices[0];
        for(int i=1;i<prices.length;i++){
            profit=prices[i]-buy;
            maxProfit=Math.max(maxProfit,profit);
            buy=Math.min(buy,prices[i]);
        }
        return Math.max(0,maxProfit);
    }
}
