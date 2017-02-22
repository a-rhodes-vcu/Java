public abstract class Shape implements Sided, Comparable<Shape>
  
{
  protected String shapeType;
  public void setType(String type)
  {
    shapeType = type;
  
  }
  public String getType()
    {
      return shapeType;
    }
    public String toString()
    {
      return shapeType;
    }
    public abstract double getArea();
    public abstract void print();
  }
