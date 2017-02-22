import java.lang.Math;

public class CirclePractice 
  
{
  private double radius;
public Circle()
{
   radius = 1.0;
}
public Circle(double r)
{
  setRadius(r);
  return r;
}
  
 public double getDiameter(double d)
 {
  d = 2 * radius; 
 }
 public double getCircumference(doucle c)
 {
   c = 2 * Math.PI * radius;
 }
 public double getArea(double a)
 {
   a = Math.PI * Math.pow(radius); 
 }
  public String toString()
  {
    String out;
    out = "......." ;
    return out; 
  }