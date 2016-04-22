public class QuickSortUtil{

public static int  partition(Comparable[] a , int lo, int hi){
  int i=lo, j=hi+1;
  while(true){
    while(less(a[++i],a[lo]))
        if(i==hi)break;
    while(less(a[lo],a[--j]))
      if(j==lo)break;
    if(i>=j)break;
      exch(a,i,j);
  }
  exch(a,lo,j);
  return j;
}

public static boolean less (Comparable i, Comparable j){
  return i.compareTo(j)<0;
}

public static void exch(Comparable[] a, int i, int j){
    Comparable temp = a[i];
    a[i]=a[j];
    a[j]=temp;
}
}
