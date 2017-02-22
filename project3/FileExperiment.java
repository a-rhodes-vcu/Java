import java.util.Scanner;
import java.io.*;

public class FileExperiment
{
  public static void main(String[] args) throws FileNotFoundException , IOException //need this in order to throw exception
  {
    FileReader inFile = new FileReader("inData.txt"); // there is an exception, wont compile. need a java file not found exception
    Scanner in = new Scanner(inFile);
    
    FileWriter outFile = new FileWriter("outData.txt");
    PrintWriter out = new PrintWriter(outFile);  

    String line = in.nextLine();
    line = in.nextLine();
    System.out.printf("%s\n,", line);
    out.printf("%s\r\n",line );
    
    in.close();
    out.close();
    //out file;
  }}