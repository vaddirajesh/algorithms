/**
 * * Definition for an interval.
 * * public class Interval {
 * *     int start;
 * *     int end;
 * *     Interval() { start = 0; end = 0; }
 * *     Interval(int s, int e) { start = s; end = e; }
 * * }
 * */
public class Solution {
  public boolean canAttendMeetings(Interval[] intervals) {
    boolean canAttendAll = true;
    if(intervals.length<=1)
      return canAttendAll;
    sort(intervals,0,intervals.length-1);
    /*        for(int i=0;i<=intervals.length-1;i++)
     *        System.out.println(intervals[i].start+","+intervals[i].end);*/
    for(int i=0;i<intervals.length-1;i++){
      if(intervals[i].end>intervals[i+1].start){
        canAttendAll=false;
        break;
      }
    }
    return canAttendAll;
  }
  public void sort(Interval[] intervals, int lo, int hi){
    if(hi<=lo) return;
    int j = partition(intervals,lo,hi);
    sort(intervals,lo,j-1);
    sort(intervals,j+1,hi);

  }
  public int  partition(Interval[] a , int lo, int hi){
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

  public boolean less (Interval i, Interval j){
    if(i.start < j.start)
      return true;
    else
      return false;
  }

  public void exch(Interval[] a, int i, int j){
    Interval temp = a[i];
    a[i]=a[j];
    a[j]=temp;
  }
}
