
public class GenericStackTest{
  public static void main(String[] args){
    GenericStack<Integer> genericStack = new GenericStack<Integer>(10);
    genericStack.push(10);
    genericStack.push(14);
    System.out.println("Popping after pushing item 14 is :"+ genericStack.pop());
  }

}
