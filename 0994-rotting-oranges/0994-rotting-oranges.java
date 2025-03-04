class Pair{
    int row;
    int col;
    int time;
    Pair(int row,int col,int time){
        this.row=row;
        this.col=col;
        this.time=time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        Queue<Pair>q=new LinkedList<>();
        int seen[][]=new int[n][m];
        int count=0;
        int freshcount=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    seen[i][j]=2;
                }
                else{
                    seen[i][j]=0;
                }

                if(grid[i][j]==1)freshcount++;
            }
        }

        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};
        int time=0;

        while(!q.isEmpty()){
            int nrow=q.peek().row;
            int ncol=q.peek().col;
            int ntime=q.peek().time;
            q.poll();

            time=Math.max(time,ntime);
            for(int i=0;i<4;i++){
                int r=nrow+delrow[i];
                int c=ncol+delcol[i];

                if(r>=0 &&r<n &&c>=0 && c<m && seen[r][c]==0 && grid[r][c]==1){
                    q.add(new Pair(r,c,ntime+1));
                    seen[r][c]=2;
                    count++;
                }
            }

        }
          
          if(count!=freshcount)return -1;

          return time;


    }
}