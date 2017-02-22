//*******
//Alexandrea Stylianou
//Due:1/23/16
//CSC 201 81-PR 
//Lab 2 Expressions
//*********
public class Expressions 
{
  public static void main(String[] args)
  {
    System.out.println("Alexandrea Stylianou");
    System.out.println("CSC 201 81-PR");
    System.out.println("Lab 2 -Expressions");
    int a = 3;
    int b = 4;
    int c = 5;
    int d = 17;
    
    System.out.println((a + b) / c);   
// 3 and 4 are added with sum 7       
// 7 is divided by 5 with quotient 1 
    
    System.out.println(a + b / c);       
// 4 is divided by 5 with quotient 0       
// 3 is added to 0 with sum 3
    
    System.out.println(a++); //returns 3, then increments    
    System.out.println(a--); //returns 4, then decrements  
    System.out.println(a + 1); //adds 1 to 3= 4       
    System.out.println(d % c); //modulus of 17/5= 2  (returns only the remainder)   
    System.out.println(d / c); //7 is divided by 5= 3       
    System.out.println(d % b); //modulous of 17/4=1   (returns only the remainder)  
    System.out.println(d / b); //7 is divided by 4 =4    
    System.out.println(d + a / d + b);  //division of 3/17 = 0.17 and addition of 17, then add 4 = 21    
    System.out.println((d + a) / (d + b));    //the sum of numerator(20) is divided by the sum of the denominator(21) = 0    
    System.out.println(Math.sqrt(b));    //the square root of 4= 2   
    System.out.println(Math.pow(a, b)); //the exponent of a variable, a is the base, b is the power, 81
    System.out.println(Math.abs(-a)); //absolute value of a variable, returns only the non negative number = 3
    System.out.println(Math.max(a, b)); //the operation chooses a max value between the two variables 3 and 4 =4   
  } 
} 