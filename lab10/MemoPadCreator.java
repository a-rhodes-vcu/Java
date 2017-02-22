import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;


public class MemoPadCreator {
 public static void main(String[] args) throws FileNotFoundException {
 Date dateStamp = new Date();
 Scanner console = new Scanner(System.in);
 System.out.print("Enter the name of the output file: ");
 String filename = console.nextLine();
 PrintWriter out = new PrintWriter(filename);
 boolean done = false;
 while (!done){
 System.out.println("Memo topic (enter -1 to end):");
 String topic = console.nextLine();
 if (topic.equals("-1")){
 done = true;
 }
 else {
 System.out.println("Memo text:");
 String message = console.nextLine();
 // Instantiate the Date object (dateStamp) here
 // using the new operator
String date = dateStamp.toString();
 out.println(topic + "\n" + date + "\n" + message);//i altered the print statment in order to print the new lines in the text document
 //in order to print to a text file
 out.flush();
 }
 }
 // Close the output file
 out.close();
 }}

