/*Alexandrea Stylianou
 * Lab 12 Inheritance
 * This is the subclass DebitCard, which extends the super class Card. 
 * */

public class DebitCard extends Card
{ 
  private String PinNumber;
  private String CardNumber;
  public DebitCard()
  {

    this.CardNumber = CardNumber;
    this.PinNumber = PinNumber;
  }
  public DebitCard(String n, String cardNum, String pinNum )
  {
   super(n);
   CardNumber=cardNum;
   PinNumber=pinNum; 
  }
  public String format()
  {
  String fmt = super.format();
  return String.format("\nPin Numer: " + PinNumber + "\nCardNumber: " + CardNumber, fmt);
  
    
  }
} 