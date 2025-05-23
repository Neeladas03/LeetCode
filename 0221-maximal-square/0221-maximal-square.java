class Solution {
    public int maximalSquare(char[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int maxsize = 0;
        int[][] dp = new int[n][m];

        for (int i = 0; i < n; i++) {
            dp[i][0] = mat[i][0] == '1' ? 1 : 0;
            maxsize = Math.max(maxsize, dp[i][0]);
        }

        for (int j = 0; j < m; j++) {
            dp[0][j] = mat[0][j] == '1' ? 1 : 0;
            maxsize = Math.max(maxsize, dp[0][j]);
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat[i][j] == '1') {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1],
                                    Math.min(dp[i - 1][j], dp[i][j - 1]));
                    maxsize = Math.max(maxsize, dp[i][j]);
                }
            }
        }

        return maxsize*maxsize;
    }
}
