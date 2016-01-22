import java.io.*;
import java.util.*;

public class Parentheses{
  private static  Map<String, String> paranthesesCouple = new HashMap<String, String>();
  private static void init(){
    paranthesesCouple.put("{","}");
    paranthesesCouple.put("[","]");
    paranthesesCouple.put("(",")");
  }
  public void setParanthesesCouple(Map<String , String> couple){
    this.paranthesesCouple = couple;
  }
  
  public static boolean isBalancedString(String[] inputArray){
    Deque<String> queue = new ArrayDeque<String>();
    Set<String> keySet = paranthesesCouple.keySet();
    for(String inputItem : inputArray){
      if(keySet.contains(inputItem)){
        queue.push(inputItem);
      }
      else{
        if((paranthesesCouple.get(queue.pop())).equals(inputItem))
          continue;
        else
          return false;
      }
    }
    return true;
  }

  public static void main(String[] args) throws IOException{ 
    System.out.println("Please enter space seperated parentheses string : ");
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String inputString = bufferedReader.readLine();
    String[] inputArray = inputString.split(" ");
    init();
    boolean isBalancedString = isBalancedString(inputArray);
    System.out.println(isBalancedString);
  }


}
