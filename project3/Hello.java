
import java.util.Scanner;
import java.io.*;


public class Hello{




    public static void main (String args[]){

     String filename;
     String line;
     Scanner input = new Scanner(System.in);

     
     
     
     System.out.println("Please enter the name of the file followed by the extension (example: name of file .txt): ");
      String in = input.nextLine();

      
      if(in.equals("Hello"))
      {
      System.out.println("Yes");
      }
    }}