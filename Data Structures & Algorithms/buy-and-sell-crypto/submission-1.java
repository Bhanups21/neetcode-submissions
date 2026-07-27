class Solution {
    public int maxProfit(int[] prices) {
        int currMin=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            currMin=Math.min(currMin,prices[i]);
            int temp=prices[i]-currMin;
            profit=Math.max(temp,profit);
        }
        return profit;
    }
}
