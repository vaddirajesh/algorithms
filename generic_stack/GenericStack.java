
public class GenericStack<T> {
  private T[] genericArray;
  private int N;
  
  public GenericStack(int capacity){
    genericArray = (T[]) new Object[capacity];
  }

  public int size(){ return N;}

  public boolean isEmpty() {return N==0 ;}

  public void push(T t){
    genericArray[N++]=t;
  }

  public T pop(){
    return genericArray[--N];
  }

}
