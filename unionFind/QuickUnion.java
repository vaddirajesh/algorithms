public class QuickUnion{
  
  private int[] id;
  
  public QuickUnion(int n){
    id = new int[n];
    for(int i=0;i<n;i++){
      id[i]=i;
    }
  }
 
  private int root(int i){
    while (i !=id[i]) i = id[i];
    return i;
  }
  void union(int p, int q){
    int i = root(p);
    int j = root(q);
    id[i]= j;
  }
  boolean connected(int p, int q){
    return id[p]==id[q];
  }
  int find(int p){
    
  }
  int count(){};

  public static void main(String[] args){

    int N = StdIn.readInt();
    QuickUnion unionFind = new QuickUnion(n);
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
