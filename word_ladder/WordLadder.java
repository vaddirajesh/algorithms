import java.util.*;
import java.io.*;

public class WordLadder{


  public static void main(String[] args){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String startWord = br.readLine();
    String lastWord = br.readLine();
    String input = br.readLine();
    ArrayList<String> dictWords = new ArrayList<String>();
    while(input!=null){
      dictWords.add(input);
      input = br.readLine();
    }
    WordLadder wordLadder = new WordLadder();
    wordLadder.findNumberOfWordsAfterTransforming(startWord,lastWord,dictWords);
  }
}
