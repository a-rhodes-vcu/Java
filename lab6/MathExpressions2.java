//*******
//Alexandrea Stylianou
//Section 81, Lab 3
//Math Expressions2
//*********
import java.util.Scanner;
public class MathExpressions2
{
  public static void main(String[] args)
  {
    System.out.println("Alexandrea Stylianou");
    System.out.println("CSC 201 81-PR");
    System.out.println("Lab 3 -Math Expressions2");
    Scanner in = new Scanner(System.in);
    String str = "Enter a celsius temperature";
    System.out.println(str);
    int temp = in.nextInt();
    float celcius = ((temp * (float)9/(float)5)) + 32;
    System.out.println("The temperature in Celsius is: " + temp);
    System.out.printf("The temperature in Fahrenheit is " + "%.2f", celcius );
  }}