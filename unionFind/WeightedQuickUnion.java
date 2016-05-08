public class WeightedQuickUnion{

  private int[] id;
  private int [] siz;

  public WeightedQuickUnion(int n){
    id = new int[n];
    siz = new int[n];
    for(int i=0;i<n;i++){
      id[i]=i;
    }
  }

  private int root(int i){
    while (i !=id[i]) {
      id[i]=id[id[i]];
      i = id[i];
    }
    return i;
  }
  void union(int p, int q){
    int i = root(p);
    int j = root(q);
    if(i==j) return;
    if(siz[i]<siz[j]) {id[i]=j;siz[j]+=siz[i];}
    else {id[j]=i;siz[i]+=siz[j];}
  }
  boolean connected(int p, int q){
    return id[p]==id[q];
  }
  int find(int p){
    
  }
  int count(){return id;};

  public static void main(String[] args){

    int N = StdIn.readInt();
    WeightedQuickUnion unionFind = new WeightedQuickUnion(n);
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

