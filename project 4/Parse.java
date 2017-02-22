public class Parse{
  public static void main(String [] args){
    String s = "Orville,   1.23   123   ";
    //System.out.println(s.trim());
    //System.out.println(s + " is " + s.length() + " byte long " + s.trim() );
    s = s.trim();
    //System.out.println(s + " is " + s.length() + " byte long " + s.trim() );
    int comoaLocation = s.indexOf(',');
    String sl = s.substring(0, comoaLocation); //-1);
    //System.out.println(sl);
    String s2 = s.substring(comoaLocation+1, s.length());
    s2 = s2.trim();
    //System.out.print(s2);
    int spaceLocation = s2.indexOf(' ');
    String s3 = s2.substring(spaceLocation, s2.length());
    s3 = s3.trim();
    s2 = s2.substring(0, spaceLocation);
    s2 = s2.trim();
    System.out.println(sl);
    System.out.println(s2);
    System.out.println(s3);
  }}