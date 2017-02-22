/*Alexandrea Stylianou
 * Arraylist Lab 9
 * CSC 201 PR-081
 * 3/12/16
 * */

import java.util.ArrayList;

public class CustomerListerArrayList
{
  public static void main(String[] args)
  {



ArrayList<String> customerNames = new ArrayList<String>();
  
  customerNames.add("Chris");
  customerNames.add("Lois");
  customerNames.add("Meg");
  customerNames.add("Peter");
  customerNames.add("Stewie");
//enhancecd for loop
  for ( String name : customerNames )
    System.out.println(name);
  
 System.out.println();
 
 //add meg and brian
  customerNames.add(3, "Brian");
  customerNames.add(3, "Meg");
  
  System.out.println("Updated new arraylist: ");
  
  //emhanced for loop
  for (String name: customerNames)
      System.out.println(name);
    //traditional for loop
  
    for(int i= customerNames.size()-1; i>0; i--) 
    {
      if (customerNames.get(i).equals("Meg"))
        customerNames.remove(i);
    }
    
    System.out.println();
   
    System.out.println("Megless array list. Updated new arraylist: ");
    //enhanced for loop
    for (String name: customerNames)
      System.out.println(name);
    
   }
}