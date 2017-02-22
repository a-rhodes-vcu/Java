import java.util.Scanner;
import java.io.*;

public class YourClass {
    public static void main(String[] args) throws FileNotFoundException
    {
       
      String fileName = args[0];
      String Name = args[1];// would contain "textInput.txt"
        // work with fileName
      
    Scanner in = new Scanner(System.in);

    in = new Scanner(new FileInputStream(args[0])); 
    PrintWriter out = new PrintWriter(args[1]);
   
    while (in.hasNextLine())
    {
      String line =in.nextLine();
      out.println(line);
     out.flush();
    }
    
     
      
    }
}