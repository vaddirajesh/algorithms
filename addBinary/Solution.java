import java.util.regex.Pattern;

public class Solution {
  public String addBinary(String a, String b) {
    boolean isAZero = Pattern.matches("^0.*", a);
    boolean isBZero = Pattern.matches("^0.*", b);
    if(isAZero==true && isBZero==true)
      return "0";
    boolean hasCarryOver = false;
    boolean aBigger = true;
    int large = a.length();
    if(large <= b.length()){
      aBigger=false;
    }
    StringBuffer stringBuffer = new StringBuffer();
    if(!aBigger){
      int difference = b.length()-a.length();
      for(int i=0;i<difference;i++){
        stringBuffer.append("0");
      }
      a=stringBuffer.append(a).toString();
    }else{
      int difference = a.length()-b.length();
      for(int i=0; i<difference; i++){
        stringBuffer.append("0");
      }
      b=stringBuffer.append(b).toString();
    }
    StringBuffer resultBuffer = new StringBuffer();
    for(int index=a.length();index>0;index--){
      StringBuffer operandBuffer = new StringBuffer();
      operandBuffer.append(a.substring(index-1,index)).append(b.substring(index-1,index));
      String operands = operandBuffer.toString();
      switch(operands){
        case "11":
          if(hasCarryOver)
            resultBuffer.append("1");
          else{
            resultBuffer.append("0");
            hasCarryOver=true;
          }
          break;
        case "10":
        case "01":
          if(hasCarryOver==true){
            resultBuffer.append("0");
          }else{

            resultBuffer.append("1");
            hasCarryOver=false;
          }
          break;
        case "00":
          if(hasCarryOver==true){
            resultBuffer.append("1");
            hasCarryOver=false;
          }else{
            resultBuffer.append("0");

          }
          break;
        default:
          break;
      }
    }
    if(hasCarryOver)
      resultBuffer.append("1");
    return resultBuffer.reverse().toString();
  }

}
