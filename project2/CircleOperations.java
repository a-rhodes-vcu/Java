import java.util.Scanner;

public class CircleOperations{

 // This is the private helper method that displays information about the
 // programmer, the course, and the project.
 private static void printHeading(){

  String name = "Alexandrea Stylianou";
  System.out.println(name);
  System.out.println("CSC 201 Spring 2015");
  System.out.println("Programming Project 2");
  System.out.println("Circle Operations");}
  
public static void main(String[] args ){

  printHeading(); // this statement calls the printHeading method

Scanner in = new Scanner(System.in);

System.out.println("   ");
//I am prompting my user to choose a letter among the options
System.out.print("Please enter D, C, or A: "); 
char letter;  //I spent almost the entire day coding this using a string variable, and after much frustation I changed it to char and it worked!
letter = in.nextLine().charAt(0);

// I am prompting my user to enter a demical number
System.out.print("Please enter a floating point number " ); 
double radius = in.nextDouble(); //radius will be my variable name for the user input

//these are my math equations
double diameter = (radius * 2);       
double cicumference = (Math.PI * radius * 2);
double area = (Math.PI * (radius * radius));
 
//below are my if/else statments
if(letter == 'D'){
    System.out.printf("The diameter of a circle with a radius of " + radius + " is " + "%.2f",diameter);}
    else if(letter == 'C'){
      System.out.printf("The circumference of a circle with a radius of " + radius + " is "  + "%.2f",cicumference);}
    else if (letter == 'A'){
      System.out.printf("The area of a circle with a radius of " + radius + " is " + "%.2f" ,area);}
  }
  
}
                                      
   
   