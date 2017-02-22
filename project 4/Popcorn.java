/*
 * Alexandrea Stylianou
 * CSC 201 PR-81
 * Spring 2016
 * Project 4 Popcorn
 * The purose of Popcorn is to input a text file with a farm name, followed by a comma, followed by a space. Then pints are listed as a double, acres are listed as integers.
 * After the text file is parsed, a series of loops must be created in order to create a flow chart of each farm acres per pints in quanities of 25.
 * This program accounts for quanities below zero and greater than 600.
 * The program is divided into 6 methods: one to call the heading, one to print the heading for the chart, one to parse, one to print the farm name, one to calulate pints/acres and one to create the chart.
*/
import java.util.Scanner;
import java.io.*;


public class Popcorn{
  //these are my static variables, any method within this class has access to these variables. very important. 
  static int acresPerPints; 
  static String line;
  static String s1;
  static String s2;
  static String s3;
  static double pints;
  static int acres;
  static int acresPerPintsPer25;
  static int comma_loc;
  static int space_loc;
  
  //print the heading
  private static void printHeading(){

  String name = "Alexandrea Stylianou";
  System.out.println(name);
  System.out.println("CSC 201 Spring 2016");
  System.out.println("Programming Project 4");
  System.out.println("Popcorn");
  System.out.println(" ");}

  public static void main (String args[]) throws FileNotFoundException {

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
     

 
 //print farm heading
 farmHeading(); 
 
 Scanner in = new Scanner(inFile); 
 
  while(in.hasNextLine()) //while loop with a nested if statment, 
  {
      line = in.nextLine(); //read in ever line, save it in the variable "line"
      line = line.trim(); //trim white space
      if (line.length() == 0 ) // if document contains white space with 0 length continue to read
      { 
      continue;
      }
      
      parse (); //call method to parse 
      
      double pints = Double.parseDouble(s2); //turn string into double
      int acres  = Integer.parseInt(s3); //turn string into int
      
      acresPerPints = praJava(acres,pints); //call method, acres per pints
      acresPerPintsPer25 = acresPerPints/25; //divide into quanties of 25
      
      String indent = "                                      ";  //create a space to seperate the farm name and chart
      String output = s1;
      s1 += indent.substring(0, indent.length() - output.length());
      
      farmName(s1); //call farm name method
      
      if (s1.length() == 0 )
      { 
      continue;
      }  
      
      chart(); //call chart method
 } 
  }
   
  
  /*************************************************farm heading****************************************/
    private static void farmHeading()
    {
    System.out.println("\t\t\tPopcorn Co-op");
    System.out.println();
    System.out.println("\t\t\t         Production in Hundreds");
    System.out.println("\t\t\t         of Pint Jars per Acre");
    System.out.println("Farm Name                                1   2   3   4   5   6");
    System.out.println("                                      ---|---|---|---|---|---|");
    } 
      /********************************************parse***********************************************/
    private static void parse () 
    {
    comma_loc = line.indexOf(','); //find comma
    s1 = line.substring(0,comma_loc); //parse at comma
    s2 = line.substring(comma_loc+1, line.length());
    s2 = s2.trim(); 
    space_loc = s2.indexOf(' '); //fins space
    s3 = s2.substring(space_loc, s2.length()); //parse at space
    s3 = s3.trim();
    s2 = s2.substring(0,space_loc);
    s2 = s2.trim();
    }
    
  /********************************************farm name***********************************************/
private static void farmName(String parseFarmName){
  System.out.print(s1);
}
  /*******************************************acres per pint******************************************/
 private static int praJava(int acres, double pints)
 {
   return (int)Math.floor(acres/pints); //acres per pints
 }
 /********************************************chart***************************************************/
private static void chart()
{  
      int n = 16;
      int i = 15;
      int m = 1;
      //int j = 17;
      int x = 600;
      int y = 24;
      while (acresPerPints <1)
      {
    System.out.print("No graph to display because the arces per pints is EQUAL to 0"); //error message if acres / pints is equal to zero
      break;
      }
      while (acresPerPints>x)  
      {
        System.out.print ("No graph to display because the arces per pints is ABOVE 600"); //error message if acres / pints is over 600
      break;
      }
      while(m<=acresPerPintsPer25 && m<=i && !(acresPerPints>x)){
        System.out.print("*"); //if acres / pints in quanities of 25 is between 0 and 400
       m++;
      }
      for(acresPerPintsPer25=acresPerPintsPer25; acresPerPintsPer25<i; acresPerPintsPer25++)
      {System.out.print(" "); // if less than 400 create space 
       }
     if(acresPerPintsPer25<=n && !(acresPerPints>x) && !(acresPerPints<m)){ //if less than 400 create a bar
     System.out.print("|");
      }
     if (acresPerPintsPer25>=n && !(acresPerPints>x)){
       System.out.print("#"); //if meets mark at 400, create pound sign
     }
     while(n<acresPerPintsPer25 && acresPerPintsPer25<=y)
     {
     System.out.print("*"); //if over 400 continue with graph until it gets to 600
     n++;
     }
     System.out.println();
}
}