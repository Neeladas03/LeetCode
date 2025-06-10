class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maxprofit=Integer.MIN_VALUE;
        for(int num:prices){
            if(num<min){
                min=num;
            }
            int profit=num-min;
            maxprofit=Math.max(profit,maxprofit);
        }

        return maxprofit;
    }
}