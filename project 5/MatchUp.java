/*
 * Alexandrea Stylianou
 * CSC 201 PR-81
 * Spring 2016
 * Project 5 Match up
 * The input file is a text file that contains code. The ouput is the text file but with the brackets numbered by incrementation 
 * if the bracket is "{" and the numbered down
*/
import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.io.IOException;

public class MatchUp{
  //static variables very important
   static int i;
   static  File inFile;
   static String line; 
   static int counter;
   static Scanner in;
  //print the heading
  private static void printHeading(){

  String name = "Alexandrea Stylianou";
  System.out.println(name);
  System.out.println("CSC 201 Spring 2016");
  System.out.println("Programming Project 5");
  System.out.println("Match up");
  System.out.println(" ");}

  public static void main (String args[]) throws FileNotFoundException { //thows exception
    try 
    
    { // try this
      
     printHeading(); // this statement calls the printHeading method
    
     Scanner input = new Scanner(System.in);
    
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
     

    in = new Scanner(inFile);  
    
    } //try brace
    
    
      catch (FileNotFoundException e) { //catch this exception. if file is not found
        System.out.println("There was an error opening the file.");
        e.printStackTrace();
      } // catch bracket
      catch (IOException e) {
      System.out.println("There was an error opening the file.");
      e.printStackTrace();
       }

  while(in.hasNextLine()) //while loop with a nested if statment, 
  {
      line = in.nextLine(); //read in ever line, save it in the variable "line"
      if (line.length() == 0 ) // if document contains white space with 0 length continue to read
      { 
      continue;
      }
   
     char c[] = line.toCharArray();//put file into an arraylist
     for( i = 0;i<c.length;i++) {
   brackets();

      } //for
  printLine(); //prints a new line
  
  } //while
   
  } //main bracket
 
  
  ///////////////////if/else statment/////////////////
  private static void brackets () 
  {
    char c[] = line.toCharArray();
  if(c[i] == '{')
      {
        counter++;
        System.out.print(c[i]+" " + counter);
      }
      else if (c[i] == '}' && counter> 0)
      {
        System.out.print(c[i]+ " " + counter); // don't rebuild, print stream in line
        counter--;
      }
      else if (c[i] == '}' )
      {
        System.out.print(c[i]+ " " + counter);
      }
      else
       {
       System.out.print(c[i]); //this can't print new line because the file is coded as a char, each character is a seperate character, therefore a new line
       //prints each character in single file
       }
  
  }
  
  /////print line////
  private static void printLine() 
  {
    System.out.println();
  }
  /////////////////////////

  
} //class bracket