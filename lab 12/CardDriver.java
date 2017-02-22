/*Alexandrea Stylianou
 * Lab 12 Inheritance
 * CSC 255 PR-081
 * 4/9/16
 * */



public class CardDriver
{
    public static void main(String[] args)
    {
Card c =  new Card("Wendy Williams");
System.out.print(c.format());
 
IDCard id = new IDCard("Wendy Williams", "0000000001");
System.out.print(id.format());

DriverLicense dl  = new DriverLicense("Wendy Williams", "0000000001", "01/2022");
System.out.print(dl.format());

DebitCard dc = new DebitCard("Wendy Williams", "987654321876", "7777");
System.out.print(dc.format());

 }}
