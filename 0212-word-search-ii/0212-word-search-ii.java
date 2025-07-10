class TrieNode {
    Map<Character, TrieNode> children;
    boolean isWord;

    public TrieNode() {
        children = new HashMap<>();
        isWord = false;
    }

    public void addWord(String word) {
        TrieNode cur = this;
        for (char ch : word.toCharArray()) {
            cur.children.putIfAbsent(ch, new TrieNode());
            cur = cur.children.get(ch);
        }
        cur.isWord = true;
    }
}

class Solution {
    private Set<String> res;         // ✅ Should be generic Set<String>
    private boolean[][] seen;        // ✅ Tracking visited cells

    public List<String> findWords(char[][] board, String[] words) {
        TrieNode root = new TrieNode();

        // Build Trie
        for (String word : words) {
            root.addWord(word);
        }

        int row = board.length, col = board[0].length;
        res = new HashSet<>();
        seen = new boolean[row][col];

        // Try DFS from each cell
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                dfs(board, i, j, root, "");
            }
        }

        return new ArrayList<>(res); // ✅ Fix: return as List, not new List<>(res)
    }

    private void dfs(char[][] board, int r, int c, TrieNode node, String word) {
        int row = board.length, col = board[0].length;

        // Out of bounds or already visited or no path in Trie
        if (r < 0 || c < 0 || r >= row || c >= col || seen[r][c] ||
            !node.children.containsKey(board[r][c])) {
            return;
        }

        seen[r][c] = true;

        // Move to next trie node
        node = node.children.get(board[r][c]);
        word += board[r][c];

        if (node.isWord) {
            res.add(word); // ✅ Found valid word
        }

        // Recurse in 4 directions
        dfs(board, r + 1, c, node, word);
        dfs(board, r - 1, c, node, word);
        dfs(board, r, c + 1, node, word);
        dfs(board, r, c - 1, node, word);

        seen[r][c] = false; // Backtrack
    }
}
