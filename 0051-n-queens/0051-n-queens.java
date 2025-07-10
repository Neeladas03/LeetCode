class Solution {
    public List<List<String>> solveNQueens(int n) {
        char grid[][]=new char[n][n];
        List<List<String>>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            Arrays.fill(grid[i],'.');
        }
        helper(0,ans,grid,n);
        return ans;
    }

    public static void helper(int row,List<List<String>>ans,char grid[][],int n){
        if(row==n){
            ArrayList<String>curr=new ArrayList<>();
            for(char arr[]:grid){
                curr.add(new String(arr));
            }

            ans.add(curr);
            return;
        }


        for(int col=0;col<n;col++){
            if(isSafe(row,col,grid,n)){
                grid[row][col]='Q';
                helper(row+1,ans,grid,n);
                grid[row][col]='.';
            }
        }
    }

    public static boolean isSafe(int row,int col,char grid[][],int n){
        for(int i=0;i<n;i++){
            if(grid[i][col]=='Q')return false;
        }

        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(grid[i][j]=='Q')return false;
        }

        for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++){
            if(grid[i][j]=='Q')return false;
        }

        return true;
    }
}