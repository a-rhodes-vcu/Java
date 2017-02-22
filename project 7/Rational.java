/*The rational class, where all my operations take place
 * 
 * */

public class Rational
{
  private int numerator; //check
  private int denominator; //check
  
////////////Constructors//////////////////
  public Rational() //check
  {
      this.numerator = 0;
      this.denominator =1;
  }
    public Rational(int num, int den) //check
      
    {
      this.numerator = num;
      this.denominator = den;
      this.normalize();
      
      if (denominator==0) //catching an exception, //check
        {
        throw new IllegalArgumentException("Denominator Cannot Be Zero.");
        } 
    }
//////////////normalize/////////////
private void normalize() //check
{
 if (this.denominator <0)
   {
    this.denominator=this.denominator * -1;
    this.numerator= this.numerator * -1;
     }
 }
    
////////////////////reduce///////////////
private void reduce()
{     
      int divisor;
      divisor = Rational.gcd(numerator, denominator);
      numerator = numerator /  divisor;
      denominator = denominator / divisor;
 }

///////////////////GCD///////////
  static int gcd(int num_1, int den_1)
  {
        int reduce;
        while (den_1 != 0) 
        {
        reduce = num_1 % den_1;
         num_1 = den_1;
        den_1 = reduce;
        }
        return num_1;
   }

 ///////////////setter for numerator/////////
 public void setNumerator(int num) //check
   {
     this.numerator = num;
   }    

//////////getter for numerator////////////
   public int getNumerator() //check
   {
     return this.numerator;
   }
   
/////////////////setter for denominator//////
   public void setDenominator(int den) //check
    {
    this.denominator = den;
     }
  ///////////////////getter for denominator//////
   public int getDenominator() //check
   {
     return this.denominator;
   }

  //////////////////////equals////////////
  public boolean equals(Rational other)
  {
   if ((this.numerator * other.denominator) == (other.numerator * this.denominator))
   {
     System.out.println("The rational numbers are equal");
       return true;
   }
    else 
      {
      System.out.println("The rational numbers are not equal");
       return false;
      }
  }
  
///////////////////////casting/////////////////////////
  public boolean equals(Object other) 
 {
  if (other == null)
  {
   return false; 
  }
  if (!(other instanceof Rational)) 
  {
   return false;
  }
  
  other = (Rational) other; //casting
  return true; 
 }

/////////////////////////add////////////////
  public void add(Rational other) //check
  {
    this.numerator = this.numerator * other.denominator +  this.denominator * other.numerator ;
     this.denominator = this.denominator * other.denominator; //denominator
     this.normalize();
     this.reduce(); 
  }
 
/////////////////////////subtract////////////////////////
  public void subtract(Rational other) //check
  {
   this.numerator = this.numerator * other.denominator -  this.denominator * other.numerator ;
   this.denominator = this.denominator * other.denominator; //denominator
   this.normalize();
   this.reduce();
  }
  
//////////////////////multiply///////////////////////////////
  public void multiply(Rational other) //check
  {
    
    this.numerator = this.numerator * other.numerator;
    this.denominator = this.denominator * other.denominator;
    this.normalize();
    this.reduce();
  
  }
 
  ///////////////////////////divide///////////////////////
  public void divide(Rational other) //check
    
  {
    this.numerator = this.numerator * other.denominator;
    this.denominator = this.denominator * other.numerator;
    this.normalize();
    this.reduce();
  }
 
/////////////////////////////////to string//////////////////////////
   public String toString() //check
  {
    this.normalize();
     return String.format("%s / %s", numerator, denominator );
    
   }
  }
