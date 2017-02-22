//Alexandrea Stylianou
//CSC 255 PR-081
//Lab 4-Selection

import java.util.Scanner; //step 1: import scanner class to accept user input

public class Lab4{
  public static void main (String [] args){
    
    System.out.println("Alexandrea Stylianou");
    System.out.println("CSC 255 PR-81");
    System.out.println("Lab 4: Selection");
    
    System.out.println("Enter one letter, and I will tell you what the corresponding digit is on the telephone: "); //Step 2: create string message asking for the user to input a letter
    Scanner input = new Scanner(System.in);
    String response = " ";
    String str = input.next();
    char letter = str.charAt(0);
    if (!Character.isLetter(letter)) {
        System.out.println("There is no matching digit for that character. Please type in a letter only"); //Step 3: create a string message indicating that the input was a non-alphabetic character
        System.exit(0);}
    if(!Character.isUpperCase(letter)) {
      System.out.println("Error message: Please type in an upper case letter only."); //Step 4: create a string message indicating that the input was a lower case letter
      System.exit(0);}
    int num = -1;
    switch (letter){ //Step 5: Create a switch statement, for all the letters and their correspoding number
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
    System.out.print("The number "  + num + " corresponds to the letter " + letter + " on the telephone"); //Step 6: Create a string message incooperating the user input and the corresponding letter 
  } }
