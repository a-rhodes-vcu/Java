public class Rectangle extends Shape
{
  private double height;
    private double width;
    public Rectangle()
    {
      this(1.0, 2.0);
    }
    public Rectangle(double h, double w)
    {
     height = h;
     width = w;
     super.setType("Rectangle ");
    }
    public double getArea()
    {
     return height * width; 
    }
    public int numberOfSides()
    {
     return 4; 
    }
    public double getPerimeter()
      
    {
      return 2*(height * width);
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
     System.out.print(getArea()); 
    }
    
}