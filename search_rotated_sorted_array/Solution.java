public class Solution{
  public int search(int[] nums, int target) {
      searchForTarget(nums,0,nums.length-1,target);
  }
  
  public int searchForTarget(int[] nums, int left, int right, int target){
      
      if(left>right)
        return -1;

      int mid = left+(right-left)/2;
      if(nums[mid]==target)
          return mid;
      
      if(nums[left]<=nums[mid]){
        if(nums[left]<target && target < nums[mid]){
          return searchForTarget(nums,left, mid-1,target);
        }else{
          return searchForTarget(nums,mid+1,right,target);
        }
      }else{
        if(nums[mide]<target && target <= nums[right]){
          return searchForTarget(nums,mid+1,right,target);
        }else{
          return searchForTarget(nums,left,mid-1,target);
        }
      }
  }
}
