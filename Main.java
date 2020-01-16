import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Compactor myCompactor = new Compactor();
    System.out.println(Arrays.toString(myCompactor.compact("test.txt")));
  }
}