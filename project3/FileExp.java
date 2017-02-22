 import java.io.*;
 import java.util.Scanner;
 public class FileExp{
   public static void main(String[] args) throws FileNotFoundException
   {
     String filename;
     String line;
     Scanner input = new Scanner(System.in);
     File inFile;
     
     System.out.println("Please enter the file name: ");
       filename = input.nextLine();
       inFile = new File(filename);
     while(!(inFile.exists() && !inFile.isDirectory())){
       System.out.print("That is not the correct filename. Please enter it again: ");
        filename = input.nextLine();
        inFile = new File(filename);}
     
     
     /*
     do {
       System.out.println("Please enter the file name: ");
       filename = input.nextLine();
     inFile = new File(filename);
     
     }
while(!(inFile.exists() && !inFile.isDirectory()));
*/
Scanner in = new Scanner(inFile);
  while(in.hasNext()){
      line = in.nextLine();
      System.out.printf("%s\n", line);
    }
   }}

