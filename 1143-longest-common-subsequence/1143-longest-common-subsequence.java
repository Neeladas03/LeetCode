class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()+1][text2.length()+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return helper(text1,text2,0,0,dp);
    }

    public static int helper(String text1,String text2,int i,int j,int dp[][]){
        if(i==text1.length()||j==text2.length()){
            return 0;
        }
        if(dp[i][j]!=-1)return dp[i][j];

        if(text1.charAt(i)==text2.charAt(j)){
            dp[i][j]=1+helper(text1,text2,i+1,j+1,dp);
        }
        else{
            dp[i][j]=Math.max(helper(text1,text2,i+1,j,dp),helper(text1,text2,i,j+1,dp));
        }
        return dp[i][j];
    }
}