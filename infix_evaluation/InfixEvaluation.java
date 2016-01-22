import java.util.*;
import java.io.*;

public class InfixEvaluation{
  
  public static void evaluate(String[] inputChars){
    Deque<String> operatorStack = new ArrayDeque<String>();
    Deque<Integer> operandStack = new ArrayDeque<Integer>();
    for(int i=0;i<inputChars.length;i++){
      String characterItem = inputChars[i];
        switch(characterItem){
          case "(": break; 
          case "+": 
          case "-":
          case "*":
          case "/":{
                    operatorStack.push(characterItem);}break;
          case ")":evaluateExpression(operandStack,operatorStack);
                   break;
          default:operandStack.push(new Integer(characterItem));break;
        }
    }      
    System.out.println("End result :"+operandStack.pop());
  }

  private static void evaluateExpression(Deque<Integer> operandStack, Deque<String>operatorStack){
         String operator = operatorStack.pop();
         int number1 = operandStack.pop();
         int number2 = operandStack.pop();
    switch(operator ){
          case "+":operandStack.push(number2+number1);break;
          case "-":operandStack.push(number2-number1);break;
          case "*":operandStack.push(number2*number1);break;
          case "/":operandStack.push(number2/number1);break;
          default :break;
        }
    } 
    
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String inputString = br.readLine();
    String[] inputChars = inputString.split(" ");
    evaluate(inputChars);
  }
}
