import java.io.*;
import java.util.*;
public class Solution {
 public int[] twoSum(int[] nums, int target) {
   Map<Integer, Integer> numbers = new HashMap<>();
   int[] result = new int[2];
   for(int i=0;i<nums.length;i++){
     if(numbers.containsKey(nums[i])){
       int indexOfCorrespondingNumber = numbers.get(nums[i]);
       result[0]=indexOfCorrespondingNumber;
       result[1]=i;
       break;
     }else{
       numbers.put(target-nums[i],i);
     }
   }
   return result;
 }
  public static void main(String[] args) throws Exception{
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String inputNumbers = br.readLine();
          String target = br.readLine();
          inputNumbers= inputNumbers.substring(1,(inputNumbers.length())-1);
          String[] stringNumbers = inputNumbers.split(",");
          int[] numbers = new int[stringNumbers.length];
          for(int i=0;i<stringNumbers.length;i++){
            numbers[i]=new Integer(stringNumbers[i]);
          }
          int targetNumber =  new Integer(target);
          Solution solution = new Solution();
          solution.twoSum(numbers, targetNumber);
      }
}
