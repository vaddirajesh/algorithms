import java.util.*;
import java.io.*;

public class SimpleQueue{

  public static void main(String[] args) throws IOException, NumberFormatException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String inputString = br.readLine();
    Deque<Integer> queue = new LinkedList<Integer>();
    while (!inputString.equals("-1")){
      queue.add(new Integer(inputString));
      System.out.println("Number added: "+queue.getLast());
      inputString = br.readLine();
    }
    Iterator<Integer> iterator = queue.descendingIterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }
    System.out.println("########Here is how poping works############");
    while(queue.peek()!=null){
      System.out.println(queue.pop());
    }
  }
}
