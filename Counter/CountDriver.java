public class CountDriver
{
  public static void main(String[] args)
  {
    Counter aCounter = null;
    try {
      aCounter = new Counter(0);
    } catch (Exception e) {
      System.out.println("Exception you must handle \"" 
                           + e.getMessage() + "\"");
    }
    if(aCounter == null) {
      System.out.println("Program cannot continue");
    } else {
      System.out.println(aCounter);
      aCounter.incr();
      System.out.println(aCounter);  
      aCounter.decr();
      System.out.println(aCounter);  
    }
   Counter bCounter = new Counter();
   aCounter.set(2);
   bCounter.incr();
   System.out.println("aCounter compares to bCounter as: " + aCounter.compareTo(bCounter));
  }
}