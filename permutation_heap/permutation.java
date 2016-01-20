import java.util.*;
import java.io.*;

public class permutation{

public ArrayList<ArrayList<Integer>> permute(int[] numbers){
  System.out.println("Number of elements "+numbers.length);      
  permutation(numbers.length, numbers);
  return new ArrayList<ArrayList<Integer>>();
}

public ArrayList<ArrayList<Integer>> permutation(int n, int[] numbers){
  if(n==1){
    for(int number:numbers){
      System.out.printf("%d ",number);
    }

    System.out.printf("\n");
  }else{
    for(int i=0;i<n-1;i++){
      System.out.println("Value :"+n);
      permutation(n-1,numbers);
      if(n%2==0){
        System.out.println("Value of even n "+n);
        print(numbers);
        int temp = numbers[n-1];
        numbers[n-1]=numbers[i];
        numbers[i]=temp;
      }else{
        System.out.println("Value of odd n: "+n);
        print(numbers);
        int temp = numbers[n-1];
        numbers[n-1]=numbers[0];
        numbers[0]=temp;
      }
    }
    permutation(n-1,numbers);
  }

  return  new ArrayList<ArrayList<Integer>>();
}
void print(int[] numbers){
  System.out.printf("Numbers during iteration :");
  for(int number :numbers){
  System.out.printf("%d ",number);
  }
  System.out.printf("\n");
}

public static void main(String[] args)throws Exception{
  BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
  String inputString = bf.readLine();
  String[] inputStringArray = inputString.split(",");
  ArrayList<ArrayList<Integer>> numbers = new ArrayList<ArrayList<Integer>>();
  int[] inputNumbers = new int[inputStringArray.length];
  for(int i=0;i<inputStringArray.length;i++){
    inputNumbers[i] = new Integer(inputStringArray[i]);
  }
  permutation per = new permutation();
  per.permute(inputNumbers);
}
}
