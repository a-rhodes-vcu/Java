import java.util.Scanner;
import java.io.*;

public class python{

  
  public static void main (String args[]) throws FileNotFoundException, NumberFormatException {
    
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
 
  while(in.hasNextLine()) //while loop with a nested if statment, 
  {
      String line = in.nextLine(); //read in ever line, save it in the variable "line"
      line = line.trim(); //trim white space
      if (line.length() == 0 ) // if document contains white space with 0 length continue to read
      { 
      continue;
      }
   int colon = line.indexOf(':');
   String s3 = line.substring(colon+1, line.length()); //parse at space
   s3 = s3.trim();
   int space = s3.indexOf(' ');
   String s4 = s3.substring(space+1, s3.length()); //parse at space
   //System.out.print(s4);
   s4 = s4.trim();
  String[] parts = s4.split(" ");
  System.out.println(parts[0]);
  

  }


  
  }}