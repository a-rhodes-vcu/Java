public class arrayTest
{
  public static void main(String[] args)
  {
    
    for (int i = 0; i<args.length; i++){
      System.out.println("argument" + i + "is" + args[i]);}
    
    String[] str = args;
    for (int j = 0; j<str.length; j++){
    System.out.print(str[j] + " ");}
    

  }

}