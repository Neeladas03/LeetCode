class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        int dp[][]=new int[n][n];

        for(int row[]:dp)Arrays.fill(row,-1);
        return helper(s,0,n-1,dp);
    }

    public int helper(String s,int i,int j,int dp[][]){
        if(i==j)return 1;
        if(i>j)return 0;

        if(dp[i][j]!=-1)return dp[i][j];

        if(s.charAt(i)==s.charAt(j)){
            dp[i][j]=2+helper(s,i+1,j-1,dp);
        }
        else{
            dp[i][j]=Math.max(helper(s,i+1,j,dp),helper(s,i,j-1,dp));
        }

        return dp[i][j];
    }
}