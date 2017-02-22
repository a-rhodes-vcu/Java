/*
 * Alexandrea Stylianou
 * Lab 5
 * CSC 201 PR-81
*/
public class StringEqual
     {
        public static void main(String[] args)
        {
           String str1 = "abcd";
           String str2 = "abcdefg";
           String str3 = str1 + "efg";
           System.out.println("str2 = " + str2);
           System.out.println("str3 = " + str3);
        
           /*strings should never be compared with ==
            the reason why '==' is not recommended is because it compares the location of the strings,
            not the lexiographic value 
            */   
        
            //this is the corrected if/else statment:
            if (str2.compareTo(str3)<=0)
            System.out.println("The strings are equal");
            else
            System.out.println("The strings are not equal");
            //the result is: the strings are equal
          
          
            
            
        }
}