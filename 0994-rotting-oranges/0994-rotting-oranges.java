class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<int[]>q=new LinkedList<>();
        int freshOrange=0;
        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};
        int seen[][]=grid;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j]==1)freshOrange++;
            }
        }

        if(freshOrange==0)return 0;
        if(q.isEmpty())return -1;

        int min=-1;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                int curr[]=q.poll();
                int row=curr[0];
                int col=curr[1];
                for(int i=0;i<4;i++){
                    int nrow=row+delrow[i];
                    int ncol=col+delcol[i];
                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && seen[nrow][ncol]==1){
                        seen[nrow][ncol]=2;
                        freshOrange--;
                        q.add(new int[]{nrow,ncol});
                    }
                }
            }
            min++;
        }
        return (freshOrange==0)?min:-1;
    }
}