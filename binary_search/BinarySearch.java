import java.util.*;
import java.io.*;

public class BinarySearch{

  public static int[] convertIntoInteger(String sortedIntString){
    String[] inputSortedStringint = sortedIntString.split(",");
    int[] sortedIntArray=new int[inputSortedStringint.length];
    for(int i=0;i<inputSortedStringint.length;i++){
      sortedIntArray[i]=new Integer(inputSortedStringint[i]);
    }
    return sortedIntArray;
  }
  public static void main(String[] args){
    BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    String sortedIntString = br.readLine();
    int[] intArray = convertIntoInteger(sortedIntString);
    System.out.println("Now please enter the search number. Enter $ to end");
    String searchNumber = br.readLine();
    while(searchNumber!="$"){
      int inputNumber = new Integer(br.readLine());
      int position = searchForPosition(intArray,inputNumber)>0?System.out.println(position):System.out.println("Not Present");
      System.out.println("Now please enter the search number. Enter $ to end");
      searchNumber=br.readLine();
    }
  }
}
