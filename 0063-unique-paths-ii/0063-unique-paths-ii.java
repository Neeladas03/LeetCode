class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int n=grid.length ,m=grid[0].length;
        int dp[][]=new int[n][m];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }

        return helper(0,0,grid,dp,n,m);
    }

    static int helper(int row,int col,int grid[][],int dp[][],int n,int m){
        if(row==n||col==m)return 0;
        if(grid[row][col]==1)return 0;
        if(row==n-1 && col==m-1)return 1;

        if(dp[row][col]!=-1)return dp[row][col];

        dp[row][col]=helper(row+1,col,grid,dp,n,m)+helper(row,col+1,grid,dp,n,m);
        return dp[row][col];
    }
}