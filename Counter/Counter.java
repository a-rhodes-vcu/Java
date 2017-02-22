/**
 * a class that creates persistent Counter objects
 */
public class Counter implements Comparable<Counter>
{
 private int count;

 /** 
  * Default constructor for a Counter initialized to zero
  */
 public Counter()
 {
  count = 0;
 }

 /** 
  * Parameterized constructor for a Counter  
  * @param c count
  */                     
  public Counter(int c)
 {
  set(c);
 }
/**
 * Increases the value of this Counter by 1
 */
 public void incr()
 {
  count++;
 }
/** 
 * Decreses the value of this Counter by 1
 */
 public void decr()
 {
  if(count > 0)
   count--;
 }

 /**
  * Returns the current value of this Counter instance
  * @return int count
  */
 public int get()
 {
  return count;
 }
 /**
  * Sets the current value of this Counter instance
  * @param c a new value for this Counter
  * @throws IllegalArgumentException for c less than 0
  */
 public void set(int c)
 {
   if(c < 0)
     throw new IllegalArgumentException("Counter cannot be set less than 0");
   else
     count = c;
 }
 
 public int compareTo(Counter other)
 {
   int ret = 0;
   if(this.count < other.count)
     ret = -1;
   else  if(this.count > other.count)
     ret = 1;
   return ret;
 }
 
 /**
  * Print information for this Counter instance
  * @return tag String "counter" and count value
  */
 public String toString()
 {
   String out;
   out = "counter: " + count;
   return out;
 } 
}
