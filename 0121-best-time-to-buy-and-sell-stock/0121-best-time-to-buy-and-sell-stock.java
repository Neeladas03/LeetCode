class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxprofit=0;
        for(int price:prices){
            min=Math.min(price,min);
            int profit=price-min;
            maxprofit=Math.max(profit,maxprofit);
        }
        return maxprofit;
    }
}