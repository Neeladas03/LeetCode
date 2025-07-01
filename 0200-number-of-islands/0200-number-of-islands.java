class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean seen[][]=new boolean[n][m];
        int island=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && !seen[i][j]){
                    island++;
                    dfs(grid,i,j,seen);
                }
            }
        }
        return island;
    }

    public static void dfs(char grid[][],int row,int col,boolean seen[][]){
        int n=grid.length;
        int m=grid[0].length;
        seen[row][col]=true;
        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};
        for(int i=0;i<4;i++){
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]=='1'
            && !seen[nrow][ncol]){
                dfs(grid,nrow,ncol,seen);
            }
        }
    }
}