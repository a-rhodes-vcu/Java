public class CountTest
{
  public static void main(String[] args)
  {
    Counter MyCounter = new Counter();
    
    System.out.println("MyCounter before is " + MyCounter.get());
    useCounter(MyCounter);
    System.out.println("MyCounter after  is " + MyCounter.get());
  }
  private static void useCounter(Counter Mine)
  {
    System.out.println("As passed Counter = " + Mine.get());
    Mine.incr();
    System.out.println("On return Counter = " + Mine.get());
  }
}