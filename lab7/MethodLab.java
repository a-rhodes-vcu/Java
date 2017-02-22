import java.io.*;
import java.util.Scanner;

public class MethodLab{
  
   public static void main(String[] args) {
     // variable declarations for part 1
     String title;
     String firstName;
     String lastName;
     Scanner in = new Scanner(System.in);
     // prompt for input for part 1
     System.out.print("Enter a title:");
     title = in.next();
     System.out.print("Enter your first name:");
     firstName = in.next();     
     System.out.print("Enter a your last name:");
     lastName = in.next();
     // call the method for part 1
     greeting(title, firstName, lastName);
     
     // variable declarations for part 2
     int number1;
     int number2;
     // user prompts for part 2
     System.out.print("Enter first number:");
     number1 = in.nextInt();
     System.out.print("Enter second number:");
     number2 = in.nextInt();
     // call the method for part 2 inside the println statement
     System.out.println("The largest number is " + max(number1, number2));
 }
   
 /******************** greeting method goes here*********************/
  private static void greeting(String title, String firstName, String lastName)
   {System.out.println();
    System.out.printf("Drea %s %s %s, \n", title, firstName, lastName);
    System.out.println();
   }
  
  
  
  
  
  
  /***********************end of method*************************/
  
  /******************** max method goes here*********************/
  
  private static int max(int number1, int number2){
    if(number1>number2)
      return number1;
    else 
      return number2;
  
  }
  
  
  
  
  
  
  /***********************end of method*************************/
   
}