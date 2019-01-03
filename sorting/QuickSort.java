import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;
public class QuickSort{
    public static void sort(int[] elements){
        
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] numbers = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            numbers[i]= scanner.nextInt();
        }
        scanner.close();
        String numberString = Arrays.asList(numbers).stream()
            .map(i -> i.toString())
            .collect(Collectors.joining(","));
        System.out.println("----> before sorting : "+numberString);
        sort(numbers);
        String sortedNumberString = Arrays.asList(numbers).stream()
            .map(i -> i.toString())
            .collect(Collectors.joining(","));
        System.out.println("----> after sorting : "+sortedNumberString);
    }
}