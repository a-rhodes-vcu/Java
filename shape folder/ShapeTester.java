import java.util.ArrayList;
public class ShapeTester
{
  public static void main(String[] args)
  {
    ArrayList<Shape> shifter = new ArrayList<Shape>();
    shifter.add(new Rectangle(1.23, 4.56));
    shifter.add(new Square(7.89));
    shifter.add(new Ellipse(1.23, 4.56));
    shifter.add(new Circle(7.89));
    for(int i = 0; i < shifter.size(); i++) {
      shifter.get(i).print();
      if(shifter.get(i) instanceof Shape)
        System.out.println("\tis a Shape");
      if(shifter.get(i) instanceof Rectangle)
        System.out.println("\tis a Rectangle");    
      if(shifter.get(i) instanceof Square)
        System.out.println("\tis a Square");  
      if(shifter.get(i) instanceof Ellipse)
        System.out.println("\tis an Ellipse");    
      if(shifter.get(i) instanceof Circle)
        System.out.println("\tis a Circle");  
     
    }
    
    Shape r = new Rectangle(1.23, 4.56);
    Shape s = new Square(7.89);
    Shape e = new Ellipse(1.23, 4.56);
    Shape c = new Circle(7.89);
if(r.compareTo(s) == 0) System.out.println("Rectangle and Squares are equal");
if(r.compareTo(c) > 0) System.out.println("Rectangle and Circles are NOT equal");

}
}