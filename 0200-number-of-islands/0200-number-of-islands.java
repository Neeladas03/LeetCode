import java.util.*;

class Pair {
    int first;
    int second;
    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {

    public void bfs(int row, int col, char[][] grid, boolean[][] seen) {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(row, col));
        seen[row][col] = true;
        
        int n = grid.length;
        int m = grid[0].length;

        // 4-directional movement
        int[] delRow = {-1, 0, 1, 0}; 
        int[] delCol = {0, 1, 0, -1};

        while (!q.isEmpty()) {
            Pair node = q.poll();
            int nrow = node.first;
            int ncol = node.second;

            for (int i = 0; i < 4; i++) { // Only 4 directions
                int r = nrow + delRow[i];
                int c = ncol + delCol[i];

                if (r >= 0 && r < n && c >= 0 && c < m && grid[r][c] == '1' && !seen[r][c]) {
                    seen[r][c] = true;
                    q.offer(new Pair(r, c));
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] seen = new boolean[n][m];

        int count = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (!seen[row][col] && grid[row][col] == '1') {
                    count++;
                    bfs(row, col, grid, seen);
                }
            }
        }
        return count;
    }
}
