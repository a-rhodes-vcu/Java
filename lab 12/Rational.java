import java.lang.Math;
public class Rational
{
  private int numerator;
  private int denominator;
  
  
  public Rational()
  {
      this.numerator = 0;
      this.denominator =1;
  }
    public Rational(int num, int den)
      
    {
      numerator = num;
      denominator = den;
     
    }
    
    public void normalize(Rational other)
    {
     if (this.denominator <0)
     {
      this.denominator=Math.abs(this.denominator);
      this.numerator= this.numerator * -1;
     }
     
      if (other.denominator <0)
     {
      other.denominator=Math.abs(other.denominator);
      other.numerator= other.numerator * -1;
     }
    }
    
  public void add(Rational other)
  {
    
     this.numerator = this.numerator * other.denominator +  this.denominator * other.numerator ;
     this.denominator = this.denominator * other.denominator; //denominator
     
  }
 
  public void subtract(Rational other)
  {
    
   this.numerator = this.numerator * other.denominator -  this.denominator * other.numerator ;
   this.denominator = this.denominator * other.denominator; //denominator
  
  }
  public void multiply(Rational other)
  {
    
    this.numerator = this.numerator * other.numerator;
    this.denominator = this.denominator * other.denominator;
  
  }
  public void divide(Rational other)
    
  {
    this.numerator = this.numerator * other.denominator;
    this.denominator = this.denominator * other.numerator;
  }
 
   public String toString()
  {
    
     return String.format("%d / %d", numerator, denominator );
   }
  }
