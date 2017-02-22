/*
 * Alexandrea Stylianou
 * CSC 201 PR-81
 * Spring 2016
 * Project 5 Match up
*/
import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.io.IOException;

public class MatchUp_Practice{
    static int[] count = {0};
 static int[] count_1 = {0};//these are my static variables, any method within this class has access to these variables. very important. 
   static String line; 
   static int comma_loc;
  //print the heading
  private static void printHeading(){

  String name = "Alexandrea Stylianou";
  System.out.println(name);
  System.out.println("CSC 201 Spring 2016");
  System.out.println("Programming Project 5");
  System.out.println("Match up");
  System.out.println(" ");}

  public static void main (String args[]) throws IOException{
    
     printHeading(); // this statement calls the printHeading method
    
     Scanner input = new Scanner(System.in);
     File inFile;
     System.out.println("Please enter the name of the file followed by the extension (example: name of file .txt): ");
     String filename = input.nextLine();
     inFile = new File(filename); //inputng file
       
     
     //if file does not exisit, keep prompting
     while(!(inFile.exists() && !inFile.isDirectory())) 
     {   
         System.out.print("Unable to the find file. Please enter file name again with the extension: ");
         filename = input.nextLine();
         inFile = new File(filename);
     }



 Scanner in = new Scanner(inFile); 
int counter = 0;
  while(in.hasNextLine()) //while loop with a nested if statment, 
  {
      line = in.nextLine(); //read in ever line, save it in the variable "line"
      line = line.trim(); //trim white space
      if (line.length() == 0 ) // if document contains white space with 0 length continue to read
      { 
      continue;
      }
      char brackets[] = line.toCharArray();
 for(int i = 0; i < brackets.length; i++) {
  if(brackets[i] == '{') 
  {
    System.out.print(brackets[i] + " " + ++count[0]); //for right sided braces increment up
  }
  if (brackets[i] == '}' ) //for left sided braces decrement down
{
    if (count[0]<0) //is the count falls below zero print out a zero instead
    {
      
      System.out.print(brackets[i] + " " + 0);
    } //if bracket
   else 
   {
     System.out.print(brackets[i] + " " + count[0]--); //decrement
    System.out.print(brackets[i]);
  
  } //nested if statement bracket

   //for bracket
 //print out input file
  } //while bracket//for bracket

   //while bracket
    
   
  
  }
  
  
  }}}