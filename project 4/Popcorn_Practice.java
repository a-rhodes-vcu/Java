//this shit is not working

/*
 * Alexandrea Stylianou
 * CSC 201 PR-81
 * Spring 2016
 * Project 4 Popcorn
*/
import java.util.Scanner;
import java.io.*;


public class Popcorn_Practice{
  private static void printHeading(){

  String name = "Alexandrea Stylianou";
  System.out.println(name);
  System.out.println("CSC 201 Spring 2016");
  System.out.println("Programming Project 4");
  System.out.println("Popcorn");
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
  while(in.hasNextLine()) //while loop with a nested if statment, 
  {
    line = in.nextLine(); //read in ever line, save it in the variable "line"
     line = line.trim();
     int values = Integer.parseInt(line);
      System.out.printf("%d");
  }
  }}
     