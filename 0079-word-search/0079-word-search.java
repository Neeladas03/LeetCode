class Solution {
    private  int row,col;
    private char board[][];
    private String word;
    private boolean seen[][];
    public boolean exist(char[][] board, String word) {
        this.board=board;
        this.word=word;
        row=board.length;
        col=board[0].length;
        seen=new boolean[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(dfs(i,j,0))return true;
            }
        }
        return false;
        
    }

    public  boolean dfs(int r,int c,int index){
        if(r<0 || c<0 || r>=row || c>=col || seen[r][c] || board[r][c]!=word.charAt(index))return false;

        if(index==word.length()-1)return true;

        seen[r][c]=true;
        boolean found=
        dfs(r+1,c,index+1)||
        dfs(r-1,c,index+1)||
        dfs(r,c+1,index+1)||
        dfs(r,c-1,index+1);

        seen[r][c]=false;
        return found;

    }
}