import java.util.Scanner;

public class Selection{
  public static void main (String [] args){
    
    System.out.print ("Enter one letter, and I will tell you what the corresponding digit is on the telephone: ");
    Scanner input = new Scanner(System.in);
    String response = " ";
    String str = input.next();
    char letter = str.charAt(0);
    if(!Character.isUpperCase(letter)){
     System.out.print("Please type in an upper case letter.");
     System.exit(0);} 
    int num = -1;
    switch (letter){
      case 'A': 
      case 'B':
      case 'C':
        num = 2; break;
      case 'D':
      case 'E':
      case 'F':
        num = 3; break;
      case 'G':
      case'H':
      case'I':
        num = 4; break;
      case'J':
      case'K':
      case'L':
        num= 5; break;
      case'M':
      case'N':
      case'O':
        num=6; break;
      case'P':
      case'Q':
      case'R':
      case'S':
      num=7; break;
      case'T':
      case'U':
      case'V':
        num=8; break;
      case'W':
      case'X':
      case'Y':
      case'Z':
        num=9; break;
      
    }
    System.out.print("The number: "  + num + " corresponds to the letter " + letter + " on the telephone");
  } }
