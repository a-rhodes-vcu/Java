/*Alexandrea Stylianou
 * CSC 201 PR 81
 * Spring 2016
 * Lab 6
*/
import java.util.Scanner;

public class CountLoop{
  
  public static void main(String[] args ){
 
int sum;
int count;
    Scanner userinput = new Scanner(System.in);
    System.out.print("Please enter a postive whole number and my program will give you the sum of it's intergers ");
    System.out.println(" ");
    count = userinput.nextInt();
 
//while number is a double/float, display error message
    do {
      userinput = new Scanner(System.in);
      System.out.println("Error: The number must be a whole number");
      count = userinput.nextInt();
      break;}
            while (!userinput.hasNextInt());
  /* 
   userinput.hasNextInt()){
   count = userinput.nextInt();}
 else if { userinput.next();
      System.out.println("Error: The number must be a whole number. Restarting.");
      count = 0;}
      */
 
 //else { System.exit(0);}
 
//while number is less than zero, keep prompting
 while (count<1){
    System.out.println("Error: Enter a positive whole number");
    count = userinput.nextInt();}
  
        
   
  

    //WHILE LOOP
   /*while (count>=1 && count<=100){
     sum=count * (count+1)/2;
     System.out.println("The sum of it's intergers is " + sum );
     break;}
     */
    
    //FOR LOOP
    /*int input = 1;
    for (input=1; count<=100; input++ ){
      sum=count * (count+1)/2;
     System.out.println("The sum of it's intergers is " + sum );
     break;}
  */

do {
 sum= count * (count+1)/2;
 System.out.println("The sum of it's intergers is " + sum);
 break;}
    while (count>1 && count<101);
}}
   
    
 



