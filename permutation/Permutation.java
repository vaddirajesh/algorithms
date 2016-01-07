import java.util.*;
import java.io.*;


public class Permutation{

 public List<List<Integer>> permute(int[] nums) {
    int lengthOfArray = nums.length;
    ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
    return permutation(lengthOfArray,nums,result);
 }
 
 public List<List<Integer>> permutation(int lengthOfArray, int[] nums,ArrayList<List<Integer>> result){
    if(lengthOfArray==1){
      ArrayList<Integer> tempResult= new ArrayList<Integer>();
      for(int number : nums){
        tempResult.add(number);
    }
    result.add(tempResult);
  }else{
  for(int i=0;i<lengthOfArray-1;i++){
    permutation(lengthOfArray-1,nums,result);
    if(lengthOfArray%2==0){
      int tempInt = nums[lengthOfArray-1];
      nums[lengthOfArray-1]=nums[i];
      nums[i]=tempInt;
    }
    else{
      int tempInt = nums[lengthOfArray-1];
      nums[lengthOfArray-1]=nums[0];
      nums[0]=tempInt;
    }
  }
  permutation(lengthOfArray-1,nums,result);
  }
  return result;
 }

 public void display(ArrayList<Integer> item){
   Iterator iterator = item.iterator();
  while(iterator.hasNext()){
    System.out.printf("%d ",iterator.next());
  }
  System.out.printf("\n");
}
 public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String inputString = br.readLine();
    String[] inputStringArray = inputString.split(",");
    int[] inputArray = new int[inputStringArray.length];
    for(int i=0;i<inputStringArray.length;i++){
      inputArray[i]=new Integer(inputStringArray[i]);
    }
    Permutation permutation = new Permutation();
    List<List<Integer>> result = permutation.permute(inputArray);
    Iterator iterator = result.iterator();
    while(iterator.hasNext()){
      ArrayList<Integer> item =(ArrayList<Integer>) iterator.next();
      permutation.display(item);
    }
 }
}
