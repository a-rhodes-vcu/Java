public class Poodle extends Dog implements Pet, Fancy
  
{
  private String color;
 
 
 public Poodle(String name, int weight, int age)
 {
   
   super(name, (double)weight, (double)age);
       this.color = color;
 }
  public Poodle(String color, String name, double weight, double age)
 {
   super(name, weight, age);
   this.color = color;
  }
    public void printHeading() 
   {
      
   System.out.println( "Alexandrea Stylianou's Lab Number 13 for CSC 255 PR-081"); 
  }
  public void walk()
  {

     System.out.println(getName() + " is ready to go outside!!!");
    
  }
  public void feed()
  {
    System.out.println(getName() + " is hungry!");
  }
  public void sleep()
  {
        System.out.println(getName() + " is sleeping");
  }
  public void groom()
  {
        System.out.println(getName() + " should be groomed");
  }
  public String toString()
  {
   return String.format("%s %s  %s\n", super.toString(), "\nColor: ", color);
          
  }
 
 }