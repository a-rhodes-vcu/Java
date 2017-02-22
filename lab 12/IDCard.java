/*Alexandrea Stylianou
 * Lab 12 Inheritance
 *This is the class IDCard that extends the super class card
 */

public class IDCard extends Card
{ 
private String idNumber;

public IDCard()
{
   this.idNumber = idNumber;
    
}  
  public IDCard (String n, String id)
{
  super(n);
  idNumber = id;
}
  
public String format()
{
  String fmt = super.format();
  return String.format("\nID Number: " + idNumber,fmt);
}
}