public class UnionFind{
  
  private int[] id;
  
  public UnionFind(int n){
    id = new int[n];
    for(int i=0;i<n;i++){
      id[i]=i;
    }
  }
  
  void union(int p, int q){
    int pid = id[p];
    int qid = id[q];
    for(int i=0;i<id.length;i++){
      if(id[i]==pid)
          id[i]=qid;
    }
  }
  boolean connected(int p, int q){
    return id[p]==id[q];
  }
  int find(int p){}
  int count(){};

  public static void main(String[] args){

    int N = StdIn.readInt();
    UnionFind unionFind = new UnionFind(n);
    while(!StdIn.isEmtpy()){
      int p = StdIn.readInt();
      int q = StdIn.readInt();
      if(!unionFind.connected(p,q)){
        unionFind.union(p,q);
        StdOut.println(p+" "+q);
      }
    }
  }
}
