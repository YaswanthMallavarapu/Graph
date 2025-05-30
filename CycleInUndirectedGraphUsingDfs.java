class Solution {
    static class Node {
        int val;
        int parent;

        public Node(int v, int p) {
            this.val = v;
            this.parent = p;
        }
    }

    public static boolean cycle(List<Integer>[] adj, boolean visited[], int src) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(src, -1));
        visited[src] = true;
        while (!q.isEmpty()) {
            Node curr = q.poll();
            int parent = curr.parent;
            int val = curr.val;
            visited[val] = true;
            for (int a : adj[val]) {
                if (visited[a] && parent != a) {
                    return true;
                } else {
                    q.add(new Node(a, val));
                }
            }

        }
        return false;
    }

    public boolean isCycle(int V, List<Integer>[] adj) {
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (cycle(adj, visited, i)) {
                    return true;
                }
            }
        }
        return false;

    }
}
