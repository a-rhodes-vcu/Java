/*Alexandrea Stylianou
 * Lab 12 Inheritance
 *This is the sub class Driver License which extends the class IdCard, which extends the superclass card
 * */

public class DriverLicense extends IDCard
{
private String expYr;
  public DriverLicense()
  {
     this.expYr = expYr;
    
  }
  public DriverLicense(String n, String id, String yr)
  {
   
   super(n,id);
   expYr = yr;
  
  }
  
  public String format()
  {
   String fmt = super.format();
  return String.format("\nExpiration Date: " + expYr, fmt);


    
  }
} 