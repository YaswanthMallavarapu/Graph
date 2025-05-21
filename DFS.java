
class Solution {
    public static void dfsTraversal(List<List<Integer>> adj, boolean vis[], List<Integer> dfs, int src) {
        vis[src] = true;
        dfs.add(src);
        for (int conn : adj.get(src)) {
            if (!vis[conn])
                dfsTraversal(adj, vis, dfs, conn);
        }
    }

    public List<Integer> dfsOfGraph(int V, List<List<Integer>> adj) {
        boolean visited[] = new boolean[V];
        List<Integer> dfs = new ArrayList<>();
        dfsTraversal(adj, visited, dfs, 0);
        return dfs;
    }

}
