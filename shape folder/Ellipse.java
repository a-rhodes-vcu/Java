public class Ellipse extends Shape
{
  private double a;
  private double b;
  public Ellipse()
  {
    this(2.0, 1.0);
  }
  public Ellipse(double a, double b)
  {
    this.a = a;
    this.b = b;
    setType("Ellipse");
  }
  public int numberOfSides()
  {
    return 1;
  }
  public double getPerimeter()
  {
    return Math.PI * (a + b);
  }
  public double getArea()
  {
    return Math.PI * a * b;
  }
   public int compareTo(Shape other) //compare this object to another object
    {
      int ret = 0;
     if(this.numberOfSides() < other.numberOfSides())
       ret = -1;
     else      if(this.numberOfSides() > other.numberOfSides())
       ret = 1;
     return ret;
    }
  public void print()
  {
    System.out.println("Object Type: " + shapeType);
    System.out.printf("\ta-axis %.2f by b-axis %.2f\n", a, b);
    System.out.printf("\twith an area of %.3f\n", getArea());
    System.out.printf("\thas %d side with perimeter of %.2f\n",
                      numberOfSides(), getPerimeter());
  }
}