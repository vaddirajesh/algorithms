import java.util.Scanner;

public class LongestPalindromeSubSequence{
    
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String inputString = scanner.next();
        scanner.close();
        int lengthOfString = inputString.length();
        int[][] memoArray = new int[lengthOfString][lengthOfString];
        for(int i=0;i<lengthOfString;i++)
            memoArray[i][i]=1;
        int lengthOfLongestPalindromeSubSequenceString = calculateLongestPalindromeSubSequence(inputString,memoArray);
        System.out.println("Length :"+lengthOfLongestPalindromeSubSequenceString);
    }

    public static int calculateLongestPalindromeSubSequence(String inputString, int[][] memoArray){
        int length = inputString.length();
        for(int l=1;l<length;l++){
            for(int j=0;j<length;j++){
                for(int k=0;k<length;k=k+l){
                    System.out.println("Length :"+l+", index :"+j+", window :"+k);
                }
            }
        }
        return 0;
    }
}