
public class InsertionSort{
  public void sortNumbers(Comparable[] a){
    for(int i=0;i<a.length;i++){
      for(int k=i;k>0;k++){
        if(SortingUtils.less(a[i],a[i-1]))
          SortingUtils.exch(a,i,i-1);
      }
    }
  }
}
