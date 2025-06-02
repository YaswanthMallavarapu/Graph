//also known as Kahn's algorithmclass Solution {
  public static void dfs(
      List<List<Integer>> adj, boolean visited[], int src, ArrayList<Integer> topo) {
    visited[src] = true;
    for (int curr : adj.get(src)) {
      if (!visited[curr]) dfs(adj, visited, curr, topo);
    }
    topo.add(src);
  }

  public int[] topoSort(int V, List<List<Integer>> adj) {
    //    boolean visited[]=new boolean[V];
    //    ArrayList<Integer>topo=new ArrayList<>();
    //    for(int i=0;i<V;i++){
    //     if(!visited[i]){
    //         dfs(adj,visited,i,topo);
    //     }
    //    }
    //    Collections.sort(topo);
    //    int t[]=new int[topo.size()];
    //    int j=0;
    //    for(int i:topo){
    //     t[j++]=i;
    //    }
    //    return t;
    int indegree[] = new int[V];
    for (int i = 0; i < V; i++) {
      for (int curr : adj.get(i)) {
        indegree[curr]++;
      }
    }
    Queue<Integer> q = new LinkedList<>();
    for (int i = 0; i < V; i++) {
      if (indegree[i] == 0) q.add(i);
    }
    ArrayList<Integer> topo = new ArrayList<>();
    while (!q.isEmpty()) {
      int curr = q.poll();
      for (int i : adj.get(curr)) {
        indegree[i]--;
        if (indegree[i] == 0) q.add(i);
      }
      topo.add(curr);
    }

    int t[] = new int[topo.size()];
    int j = 0;
    for (int i : topo) {
      t[j++] = i;
    }
    return t;
  }
}
