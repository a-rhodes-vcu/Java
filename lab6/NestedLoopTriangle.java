/*Alexandrea Stylianou
 * CSC 201 PR 81
 * Spring 2016
 * Lab 6
 * 
*/
public class NestedLoopTriangle{
  
  public static void main (String [] args){
    
    int i = 1;
    int j = 1;
    int space = 10; 
    
//THREE NESTED FOR LOOPS
for (i = 1; i <= 10; i++) {//10 columns
  //Below is the code for nested for loop, it is inside the loop that controls the rows, producing a pyramid
  //PART 1.WITHOUT THIS NESTED LOOP, THIS TRIANGE WOULD BE A RIGHT TRIANGLE AND NOT A PYRAMID. 
    for (j=1; j<=space; j++)  
      System.out.print(" "); 
    //A NESTED FOR LOOP PRODUCING 19 ROWS
  for (j = 1; j <= 19; j++){ 
  }
          /*j needs twice as many i's, that is why 2 *i
          as i is doubled, one is subtracted from i and gives the pyramid a 1,3,5,7... pattern
          j is less than or equal to this operation, as it increments it deposits the asterisk
          in other words, when j is 0=one asterisk
            when j is 1=three asterisk, 
            when j is 2=5 asterisk
           */
          for (j = 1; j <=2*i-1; j++) { 
              System.out.print("*");
              if(j>=i);}
          
          System.out.println();
          //this decrements "space", resulting in 10 spaces in the first row
          //8 spaces in the second row, so on and so forth
          space=space-1; 
      }
  }}