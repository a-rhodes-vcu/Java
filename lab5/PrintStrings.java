/*
 * Alexandrea Stylianou
 * Lab 5
 * CSC 201 PR-81
*/
import java.util.Scanner; 

public class PrintStrings{
  public static void main (String [] args){
    
    System.out.println("Alexandrea Stylianou");
    System.out.println("CSC 255 PR-81");
    System.out.println("Lab 4: Print Strings");
    
    String word1;
    String word2;
    
    System.out.print("Please two words ");
    Scanner print = new Scanner(System.in);
    String response = " "; //output to display
    
    word1=print.next();
    word2=print.next();
    
    System.out.println(word1.compareTo(word2));
  }}