import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTryCatch
{
  public static void main(String args[]) throws FileNotFoundException
  {
    Scanner input = new Scanner(System.in);
    String fileName = "";
    File inFile;
    boolean fileNotFound = false;
    
    // Approach 2 assume file can be found and try to open it for processing
    do {
      System.out.print("Enter the input file name: ");
      fileName = input.next();
      System.out.println("Filename entered is " + fileName);
      inFile = new File(fileName);    
      try {
        Scanner fileInput = new Scanner(inFile);
        String inStr = "";
        while(fileInput.hasNext())
        {
          inStr = fileInput.next();
          System.out.println(inStr);
        }
        fileInput.close();  
        fileNotFound = false;
      } catch(FileNotFoundException e) {
        fileNotFound = true;
        System.out.println(e.getMessage());
      }
    } while (fileNotFound);
  }
}