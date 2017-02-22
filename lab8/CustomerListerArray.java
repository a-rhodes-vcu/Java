/*Alexandrea Stylianou
 * CSC 201 PR 81
 * Lab 8-Arrays
*/


public class CustomerListerArray{
  
  public static void main(String[] args){
 
//first array
    //String [] customerName = new String[7]; //partially filled array
    String [] customerName = {"Chris","Lois","Meg", "Peter", "Stewie",};
    //chris is 0, lois is 1, meg is 2, peter is 3, stewie is 4
    
    //print the array
     for (String element : customerName ){
      System.out.println(element);
      }
    System.out.println();
  
    //add spaces in order to create space for new elements
    customerName = new String[]{"Chris","Lois","Meg", " " , " ", "Peter", "Stewie",};
 
    //moves down elements in the array
    for (int i = customerName.length-1;i>3; i--){
    customerName[i] = customerName[i-2];}
    
 //add new elements to array
 customerName[3] = "Meg";
 customerName[4] = "Brian";
 customerName[5] = "Peter";
 customerName[6] = "Stewie";
 
 //print array
 for (String element : customerName ){
      System.out.println(element);
      }
    System.out.println();

 String searchString = "Meg";
  //traditional for loop and nested if statments to remove both instances of "Meg"
    for (int m = 0; m <= customerName.length-1; m++ ) {
      if (customerName[m].equals(searchString))
      { for(int j = m; j<customerName.length;j++){
        if(j<customerName.length-1)
        {
        customerName[j] = customerName[j+1];}
        else {customerName[j]=  " ";}}}
     if (customerName[m].equals(searchString))
      { for(int j = m; j<customerName.length;j++){
        if(j<customerName.length-1)
        {
        customerName[j] = customerName[j+1];}
        else {customerName[j]=  " ";
        } 
     }}}
  
    //print elements
         for (String element : customerName ){
      System.out.println(element);
      }
   
  }}
       
 
 
  