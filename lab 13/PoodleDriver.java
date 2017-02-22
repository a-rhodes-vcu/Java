/* This is a driver to test the Poodle class 
 * which class extends the Dog class and implements
 * Fancy and Pet
 */
 
class PoodleDriver {
  


 public static void main(String[] args) {
   
  
  Poodle Fifi = new Poodle("silver","Fifi",2,3);
  Fifi.printHeading();
  System.out.println(Fifi);
  Fifi.bark();
  Fifi.sleep();
  Fifi.walk();
  Fifi.feed();
  Fifi.groom();
 }
 
}