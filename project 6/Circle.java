/*Alexandrea Stylianou
 * CSC 255 0PR-81
 * Project 6
 * The purpose of this project is implement a class method that is activated by the main method that is the driver
 * The goal of the program is compute the circumference, area and diameter.
 */

import java.lang.Math;

public class Circle
{
  private double radius; //instance variable
  public Circle() //default constructor
    
  {
   radius = 1.0;
  }
  
  public Circle(double r) { //parametrized constructor
  try
    {
   setRadius(r);  //accessor methods
  }
    catch (IllegalArgumentException e)
    {
     System.out.println(e); 
     System.out.println("radius not set to null");
     //radius = (double) null;
    }
  }
  
  public double getRadius() //mutator methods
  {
   return radius;
  }
  public void setRadius(double r) throws IllegalArgumentException
  {
    if (r> 0.0)
      radius = r;
    else 
      throw new IllegalArgumentException("radius must be greater than zero");
  }
public double getDiameter() //computing diameter
{
  return 2 * radius;
}
public double getCircumference() //computing circumference
{
 return 2* Math.PI * radius;
}
  public double getArea() //computer area
  {
   return Math.PI * radius * radius; 
  }
public String toString() //too string method.over ride the object.
{
 String out;
 out = "circle Radius is " + radius;
return out;

}

}




  