public class Graph {
    private int V;
    private Bag<Integer>[] adj;

    Graph (int V){
        adj = (Bag<Integer>[]) new Bag[V];
        this.V = V;
        for (int i = 0; i < V; i++){
            adj[i] = new Bag<Integer>();
        }
    }
    public void addEdge(int v, int w){
        adj[v].add(w);
        adj[w].add(v);
    }

    public Iterable<Integer> adj(int v){
        return adj[v];
    }
}
