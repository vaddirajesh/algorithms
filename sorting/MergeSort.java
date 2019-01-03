import java.land.System;
import java.util.Scanner;

public class MergeSort{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int seed = scanner.nextInt();
    Integer[] randomIntegerArray = InsertionSort.getRandomInteger(size,seed);
    System.out.println("--->Before Sorting");
    Arrays.asList(randomArray).stream().forEach(System.out::println);
    mergeSort(randomArray,0,randomArray.length);
    System.out.println("--->After Sorting");
    Arrays.asList(randomArray).stream().forEach(System.out::println);
  }
  public static void mergeSort(Integer[] randomIntegerArray,int low, int high){
    int middle=low+high/2;
    mergeSort(randomIntegerArray,low,middle);
    mergeSort(randomIntegerArray,middle+1,hi);
    merge(randomIntegerArray,low,middle,high);
  }

  public static void merge(Integer[] randomIntegerArray, int low, int middle, int high){
    
  }
}
