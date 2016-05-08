
public class Graph{
  private final int v;
  private Bag<Integer>[] adj;

  public void Graph(int v){
    this.v=v;
    adj = (Bag<Integer>[]) new Bag[v];
    for(int i=0;i<v;i++)
      adj[i]=new Bag<Integer>();
  }

  public void addEdge(int v, int w){
    adj[v]=w;
    adj[w]=v;
  }

  public Iterable<Integer> adj(int v){
    return adj[v];
  }
}
