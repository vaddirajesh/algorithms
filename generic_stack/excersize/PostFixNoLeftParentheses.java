import java.io.*;
import java.util.*;

public class PostFixNoLeftParentheses{
  private static  Map<String, String> paranthesesCouple = new HashMap<String, String>();
  private static void init(){
    paranthesesCouple.put("}","{");
    paranthesesCouple.put("]","[");
    paranthesesCouple.put(")","(");
  }
  
  public static String computeInfix(String[] inputArray){
    Deque<String> operandQueue= new ArrayDeque<String>();
    Deque<String> operatorQueue=new ArrayDeque<String>();
    Deque<String> finalResult = new ArrayDeque<String>();
    for(String inputSymbol : inputArray){
      switch(inputSymbol){
        case "+":
        case "-":
        case "/":
        case "*":
        case "%":
                  break;
        default :
                  break;
      }
    }
    return finalResult.pop();
  }


  public static void main(String[] args) throws IOException{ 
    System.out.println("Please enter space seperated parentheses string : ");
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String inputString = bufferedReader.readLine();
    String[] inputArray = inputString.split(" ");
    init();
    String infixExpression = computeInfix(inputArray);
    System.out.println(infixExpression);
  }

}
