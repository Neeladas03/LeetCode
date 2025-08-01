class Solution {
    private static boolean isValid(char[][] board, int row, int col, char ch) {
        for (int i = 0; i < 9; i++) {
            // Check row and column
            if (board[row][i] == ch || board[i][col] == ch) {
                return false;
            }

            // Check 3x3 box
            int subRow = 3 * (row / 3) + i / 3;
            int subCol = 3 * (col / 3) + i % 3;
            if (board[subRow][subCol] == ch) {
                return false;
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    private static boolean solve(char[][] board){
        int n = board.length;
        int m = board[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j] == '.'){
                    for(char ch = '1'; ch<= '9'; ch++){
                        if(isValid(board,i,j,ch)){
                            board[i][j] = ch;
                            if (solve(board)){
                                return true;
                            }
                             board[i][j] = '.'; //
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}