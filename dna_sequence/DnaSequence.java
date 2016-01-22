import java.util.*;
import java.io.*;

public class DnaSequence{

public static List<String> repetedDNASequence(String inputString){
  List<String> result = new ArrayList<String>();
  int len = inputString.length();
  if (len < 10) {
      return result;
  }
  Map<Character, Integer> map = new HashMap<Character, Integer>();
  map.put('A', 0);
  map.put('C', 1);
  map.put('G', 2);
  map.put('T', 3);
  Set<Integer> temp = new HashSet<Integer>();
  Set<Integer> added = new HashSet<Integer>();
  int hash = 0;
  for (int i = 0; i < len; i++) {
    if (i < 9) {
      //each ACGT fit 2 bits, so left shift 2
      hash = (hash << 2) + map.get(inputString.charAt(i));
      System.out.println("hash "+i+" :"+hash);
    }else {
      hash = (hash << 2) + map.get(inputString.charAt(i));
      System.out.println("Before Anding : "+hash);
      ////make length of hash to be 20
      hash = hash &  (1 << 20) - 1; 
      System.out.println("after anding: "+hash);
      if (temp.contains(hash) && !added.contains(hash)) {
      result.add(inputString.substring(i - 9, i + 1));
      added.add(hash); //track added
      } else {
      temp.add(hash);
      }
      }
      }
      return result;
}

public static void main(String[] args) throws Exception{
  System.out.println(2 & (1<<20));
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  String readString = br.readLine();
  List<String> result = repetedDNASequence(readString);
  Iterator resultIterator = result.iterator();
  while(resultIterator.hasNext()){
  System.out.println(resultIterator.next());
  }
}
}
