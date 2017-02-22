/*Alexandrea Stylianou
 * Lab 12 Inheritance
 *This is the super class card, Debit card and ID Card extends this super class
 * */
public class Card{
   private String name;

   public Card(){
      this(" ");
   }

   public Card(String n) {
      name = n;
   }

   public String getName(){
      return name;
   }

   public boolean isExpired(){
      return false;
   }

   public String format(){
      return "Card holder: " + name;
   }
}

