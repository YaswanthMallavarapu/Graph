class Solution {
    class Pair {
        int dist;
        int dest;

        Pair(int d, int de) {
            this.dist = d;
            this.dest = de;
        }
    }

    public int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {
        int dist[] = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[S] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a, b) -> a.dist - b.dist);
        pq.add(new Pair(0, S));
        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            int distance = p.dist;
            int destination = p.dest;
            for (ArrayList<Integer> curr : adj.get(destination)) {
                int neighbor = curr.get(0);
                int d = curr.get(1);
                if (distance + d < dist[neighbor]) {
                    dist[neighbor] = distance + d;
                    pq.add(new Pair(dist[neighbor], neighbor));
                }
            }
        }
        return dist;
    }
}
// Time Complexity: O(E log V), where E is the number of edges and V is the
// number of vertices.