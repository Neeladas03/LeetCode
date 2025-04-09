class Solution {
    private int time = 0;
    private List<List<Integer>> result;

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        result = new ArrayList<>();

        // Build adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (List<Integer> edge : connections) {
            int u = edge.get(0), v = edge.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] disc = new int[n]; // discovery time
        int[] low = new int[n];  // low time
        Arrays.fill(disc, -1);   // unvisited

        // DFS from node 0
        dfs(0, -1, disc, low, adj);

        return result;
    }

    private void dfs(int u, int parent, int[] disc, int[] low, List<List<Integer>> adj) {
        disc[u] = low[u] = time++;
        
        for (int v : adj.get(u)) {
            if (v == parent) continue; // Skip the parent node

            if (disc[v] == -1) {
                dfs(v, u, disc, low, adj);
                low[u] = Math.min(low[u], low[v]);

                // Bridge condition
                if (low[v] > disc[u]) {
                    result.add(Arrays.asList(u, v));
                }
            } else {
                // Back edge
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }
}
