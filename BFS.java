class Solution {
    public List<Integer> bfsOfGraph(int V, List<List<Integer>> adj) {
        boolean visited[] = new boolean[V];
        visited[0] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        List<Integer> bfs = new ArrayList<>();
        bfs.add(0);
        while (!q.isEmpty()) {
            int curr = q.poll();
            bfs.add(curr);
            for (int conn : adj.get(curr)) {
                if (!visited[conn])
                    q.add(conn);
                visited[conn] = true;
            }

        }
        return bfs;
    }
}
