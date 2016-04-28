public class Solution {
  public boolean isValid(String s) {
    if(s.length()<=1)
      return false;
    Map<String, String> braceMap = new HashMap<>();
    braceMap.put("(",")");
    braceMap.put("{","}");
    braceMap.put("[","]");
    Stack<String> charStack = new Stack<>();
    int i=0;
    while(i<=s.length()-1){
      String testBracket = s.substring(i,i+1);
      if(braceMap.get(testBracket)!=null){
        charStack.push(testBracket);
      }else{
        if(!charStack.isEmpty()){
          String stackTopElement = charStack.peek();
          if(testBracket.equals(braceMap.get(stackTopElement))){
            charStack.pop();
          }else{
            charStack.push(testBracket);
          }

        }else{
          charStack.push(testBracket);
        }
      }
      i++;
    }
    if(charStack.isEmpty())
      return true;
    else
      return false;
  }
}
