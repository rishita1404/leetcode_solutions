class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=Integer.MIN_VALUE;
        int minimum=prices[0];
        for(int i=0; i<prices.length; i++){
            if(prices[i]<minimum){
                minimum=prices[i];
            }
            else{
                maxprofit=Math.max(maxprofit, prices[i]-minimum);
            }
        }
        return maxprofit;
    }
}