
public class SelectionSort{

public void SelectionSort(Comparable[] a){
  
  for(int i=0;i<a.length;i++){
    int min =i;
    for(int j=i+1;j<a.length;j++){
      if(SortingUtils.less(a[j],a[min]))
          min=j;
          SortingUtils.exch(a,i,min);
    }
  }

}

}
