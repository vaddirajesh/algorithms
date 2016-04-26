public class Solution {
  public boolean isPalindrome(String s) {
    char[] characterArray = s.trim().toCharArray();
    int length = characterArray.length;
    int i=0;
    int j=length-1;
    boolean isPalindrome = true;
    while(i<=j){
      if(!Character.isLetter(characterArray[i]) && !Character.isDigit(characterArray[i])){
        i++;}else
          if(!Character.isLetter(characterArray[j]) && !Character.isDigit(characterArray[j])){
            j--;    }else
              if(Character.isJavaIdentifierPart(characterArray[i]) && Character.isJavaIdentifierPart(characterArray[j])){
                if(Character.toLowerCase(characterArray[i])==Character.toLowerCase(characterArray[j])){
                  i++;
                  j--;
                }else{
                  isPalindrome= false;
                  break;
                }
              }
    }
    return isPalindrome;
  }
}
