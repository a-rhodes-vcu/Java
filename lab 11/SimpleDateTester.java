/*Alexandrea Stylianou
 * CSC 255 -PR-081
 * Lab 11 - Classes
 */

import java.util.ArrayList;


public class SimpleDateTester {
  
  public static void main(String[] args){
    
    
 SimpleDate SimpleDateTest = new SimpleDate();
  ArrayList<SimpleDate> dates = new ArrayList<SimpleDate>(); // create a collection of SimpleDate objects using an ArrayList.
  //Add at least five SimpleDate objects to the collection
    dates.add(new SimpleDate()); //two constructors 
    dates.add(new SimpleDate(07,13,1992)); //second constructors
    dates.add(new SimpleDate(1,19,1976));
    dates.add(new SimpleDate(5,6,1949));  
    dates.add(new SimpleDate(4,16,1986));
    dates.add(new SimpleDate(10,15,1980));
    
  /*
    try {
      dates.get(0).setMonth(13);
    }
    catch (IllegalArgumentException e)
    {
     System.out.print(e); 
    }
  */
  System.out.println();
    //write an enhanced for loop to iterate over the collection, calling the toString method of each SimpleDate element.
    System.out.println("Enhanced Loop: ");
    for ( SimpleDate element : dates )
    {
     System.out.print(element);
    }
    System.out.println();
    // To test the accessor and mutator methods implement a traditional for loop and in the body of the loop use the SimpleDate methods to increment the month, day, and year for each of the objects.
   System.out.println("Traditional Loop to test the accessor and mutator methods: ");
    for (int i = 0; i<dates.size(); i++)
    {
     System.out.print(dates.get(i)); 
    }
    
   
    
    
 }
 }
   