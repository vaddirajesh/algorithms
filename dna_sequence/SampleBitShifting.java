
import java.util.*;
import java.io.*;

public class SampleBitShifting{

public static void main(String[] args) throws Exception{
  int hash=1;
  for(int i=0;i<10;i++){
    System.out.println("Left shift by 2 :"+ (hash << 2));
    System.out.println("left justify by 20 :"+ (hash & (1 << 20) - 1));
  }
}
}
