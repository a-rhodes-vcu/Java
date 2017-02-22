/*
 * Alexandrea Stylianou
 * CSC 201 PR-81
 * Spring 2016
 * Project 3 Line Numbers
 * 
 * The purpose of the project is to read an input file and number lines containing a character or characters
 * The input is an input file, the output will be the same file however, it will have the leading whitespace removed. 
 * Then the length is checked on every line. 
 * If the length is zero a number will not be displayed at the begining of the line
 * If the length is more than zero, a number will be displayed on every line.
*/
import java.util.Scanner;
import java.io.*;


public class LineNumbers{
  private static void printHeading(){

  String name = "Alexandrea Stylianou";
  System.out.println(name);
  System.out.println("CSC 201 Spring 2016");
  System.out.println("Programming Project 3");
  System.out.println("LineNumbers");
  System.out.println(" ");}

  public static void main (String args[]) throws FileNotFoundException{

    printHeading(); // this statement calls the printHeading method
     String filename;
     String line;
     Scanner input = new Scanner(System.in);
     File inFile;
     
     
     
     System.out.println("Please enter the name of the file followed by the extension (example: name of file .txt): ");
      filename = input.nextLine();
      inFile = new File(filename); //inputng file
     while(!(inFile.exists() && !inFile.isDirectory())){ //if file does not exisit, keep prompting
       System.out.print("Unable to the find file. Please enter file name again with the extension: ");
         filename = input.nextLine();
        inFile = new File(filename);}
     
  Scanner in = new Scanner(inFile);
   int lineNumber = 1; 
  while(in.hasNextLine()) //while loop with a nested if statment, 
  {
      line = in.nextLine(); //read in ever line, save it in the variable "line"
      line = line.trim(); //trim white space
      if (line.length()>0) //check length 
      {
       System.out.println(lineNumber + ". " + line);
       lineNumber++; //add line numbers
      }
      else if (line.length()==0) //if length is zero, skip and continune
      {
        System.out.println(" "); 
      }
  }
 
 
 in.close(); //close the file
 }}
 
