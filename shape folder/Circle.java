public class Circle extends Ellipse
{
  private double radius;
  public Circle()
  {
    this(2.0);
  }
  public Circle(double r)
  {
    super(r, r);
    radius = r;
    setType("Circle");
  }
  public void print()
  {
    System.out.println("Object Type: " + getType());
    System.out.printf("\tradius of %.2f\n", radius);
    System.out.printf("\twith an area of %.3f\n", getArea());
    System.out.printf("\thas %d side with perimeter of %.2f\n",
                      numberOfSides(), getPerimeter());
  }
}