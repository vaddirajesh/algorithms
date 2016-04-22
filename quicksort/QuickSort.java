public class QuickSort{

  public void  quickSort(Comparable[] a, int lo, int hi){
      if(hi<=lo) return;
      int j = QuickSortUtil.partition(a,lo,hi);
      quickSort(a,lo,j-1);
      quickSort(a,j+1,hi);
  }

  public void sort(Comparable[] a){
    quickSort(a,0,a.length-1);
  }

}
