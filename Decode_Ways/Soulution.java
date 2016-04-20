public class Solution {
  public int numDecodings(String s) {
    if(s==null||s.length()==0||s.equals("0"))
      return 0;

    int[] totalCountEntries = new int[s.length()+1];
    totalCountEntries[0]=1;
    if(isValidAlphabet(new Integer(s.substring(0,1))))
      totalCountEntries[1]=1;
    else
      totalCountEntries[1]=0;

    for(int i=2;i<=s.length();i++){
      if(isValidAlphabet(new Integer(s.substring(i-1,i))))
        totalCountEntries[i]+=totalCountEntries[i-1];
      if(isValidAlphabet(new Integer(s.substring(i-2,i))))
        totalCountEntries[i]+=totalCountEntries[i-2];
    }
    return totalCountEntries[s.length()];
  }
  public boolean isValidAlphabet(int number){
    if(number ==0 || number < 1 || number > 26 )
      return false;
    else
      return true;
  }
}
