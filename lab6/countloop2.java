import java.util.Scanner;
public class countloop2 {
  public static void main (String[] args){
    
    int maxcount = getValid();
    int forcount =0;
    
    for (int i = 1; i<101; i++)
      forcount +=i;
    System.out.println("for loop total :" + forcount);
    
    int docount = 0;
    int i = 1;
    do {
      docount += i++;}
    while(i<101);
    System.out.println("do while total :" + docount);
    
    int whilecount = 0;
    i = 0;
    while(++i < 101)
    {whilecount +=i;}
    System.out.println("while loop total: " + whilecount);}
  
  private static int getValid(){
    int ret = 0;
      Scanner in = new Scanner(System.in);
    System.out.println("error an interger value on the interval (1,100)");
    if(in.hasNextInt()){
      ret = in.nextInt();}
      //return ret;}
    else {in.nextLine();}
    //int get = in.nextInt();
    //{ return 100;}
    return ret;
    }}