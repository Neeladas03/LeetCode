class Solution {
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        if(n==1)return 0;

        int prev[]=new int[n];
        int curr[]=new int[n];

        for(int t=1;t<=k;t++){
            int maxdiff=-prices[0];
            for(int i=1;i<n;i++){
                curr[i]=Math.max(curr[i-1],prices[i]+maxdiff);
                maxdiff=Math.max(maxdiff,prev[i]-prices[i]);
            }
            prev=curr.clone();
        }

        return prev[n-1];
    }
}