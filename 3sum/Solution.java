import java.util.List;
import java.util.ArrayList;

public class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
     sortNumbers(nums,0,nums.length-1);
    if(nums[nums.length-1]<0 || nums[0]>0 )
      return new ArrayList();
    int size = nums.length;
    for(int i=0;i<size-3;i++){
      int number = nums[i];
      int start = i+1;
      int end = size-1;
      while(start<end){
      }
    }  
    return new ArrayList<List<Integer>>();
  }

  public void sortNumbers(int[] numbers,int i, int j){
    if(i<=j)return;
    int partitionElelment = partition(numbers,i,j);
    sortNumbers(numbers,i,partitionElelment-1);
    sortNumbers(numbers,partitionElelment+1,j);
  }

  public int partition(int[] a, int lo, int hi){
    int i=lo,j=hi;
    while(true){
      while(less(a[++i],lo))
        if(i==hi)break;
      while(less(a[lo],a[--j]))
        if(j==lo)break;
      if(i>=j)break;
      exchange(a,i,j);
    }
    exchange(a,lo,j);
      return j;
  }
  public boolean less(int i, int j){
    return i<j;
  }
  public void exchange(int[]a, int i, int j){
    int temp = a[i];
    a[j]=a[i];
    a[i]=a[j];
  }
}
