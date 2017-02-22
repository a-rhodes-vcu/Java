import java.lang.*;


public class Reduce
{


 public static void main(String[] args)  
 {
  int one = 2;
  int two = 10;
  int three = 2;
  int four = 10;
  
  int total_1;
  int total_2;
  
total_1 = one * four +  two * three ;
total_2 = two * four; //denominator;
  
  System.out.printf(" %s / %s ", total_1,total_2 );
  int r;
  while (total_2!=0) {
        r = total_2/total_1;
        one = two;
        //two = r;
        System.out.printf("%d", r);
        break;
    }
  
    // either one is 0, so return the non-zero value

     
      
  
}
 
 }