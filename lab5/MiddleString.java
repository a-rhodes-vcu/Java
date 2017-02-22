/*Test data:
 * A)Mr. Tambourine Man
 *   1)Hey Mr tambourine    Result: Mr 
 *   2)man play a           Result: man
 *   3)song for me          Result: me
 * B) Hey Jude
 *   4)Hey jude dont        Result: Hey
 *   5)make it bad          Result: it
 *   6)take a sad           Result: sad
 *   7)song and make        Result: make
 *   8)it bett er           Result: er
 * C)Ray Charles
 *   9)Ah you can           Result: can
 *   10)talk about the      Result: talk
 *   11)pit barbecure the   Result: pit
 *   12)band was jumpin     Result: jumpin
 *   13)the people too      Result: the
 *   14)the mess around     Result:mess
*/
/*
 * Alexandrea Stylianou
 * Lab 5
 * CSC 201 PR-81
*/
import java.util.Scanner;

public class MiddleString{
  
  public static void main(String[] args){
 
//declaring strings, i prefer 'word' vs. 'str' because 'word' is more readable to me
    String word1;
    String word2;
    String word3;

    System.out.print("Please enter three words ");
    Scanner print = new Scanner(System.in);
    String response = " "; //output to display
    
    word1=print.next();
    word2=print.next();
    word3=print.next();

//if else statements
if ((word1.compareTo(word2) <= 0) && (word2.compareTo(word3) <= 0) 

      || (word3.compareTo(word2) <= 0) && (word2.compareTo(word1) <= 0))

{System.out.println("The middle string is " + word2);}

      else if((word1.compareTo(word3)<=0) && (word3.compareTo(word2)<=0)

          || (word2.compareTo(word3)<=0) && (word3.compareTo(word1)<=0)) 

{System.out.println("The middle string is " + word3);}

         else{System.out.println("The middle string is " + word1);}
        
        }
}


    