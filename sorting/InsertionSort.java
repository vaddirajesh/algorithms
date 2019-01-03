import java.util.List;
import java.util.Random;
import java.lang.Math;
import java.util.Scanner;
import java.lang.System;
import java.util.Arrays;

public class InsertionSort{

    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      int size = scanner.nextInt();
      int seed = scanner.nextInt();
      Integer[] randomArray = getRandomInteger(size,seed);
      System.out.println("--->Before Sorting");
      Arrays.asList(randomArray).stream().forEach(System.out::println);
      sort(randomArray);
      System.out.println("--->After Sorting");
      Arrays.asList(randomArray).stream().forEach(System.out::println);
    }

    public static void sort(Integer[] randomArray){
      for(int i=1;i<randomArray.length;i++){
        for(int j=i;j>0;j--){
          if(randomArray[j]<randomArray[j-1])
            swap(randomArray,j,j-1);
        }
      }
    }

    public static Integer[] getRandomInteger(int size, int seed){
      Random random = new Random();
      random.setSeed(seed);
      Integer[] randomIntegerArray = new Integer[size];
      for(int i=0;i<size;i++)
        randomIntegerArray[i]=random.nextInt();
      return randomIntegerArray;
    }

    public static void swap(Integer[] intArray, int pos1, int pos2){
      int temp = intArray[pos1];
      intArray[pos1]=intArray[pos2];
      intArray[pos2]=temp;
    }
}
