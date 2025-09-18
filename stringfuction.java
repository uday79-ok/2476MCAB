import java.util.Scanner;
class Stringfun
{
public static void main(String args[])
{
menu();
}
static void menu()
{
Scanner scn=new Scanner(System.in);
while(true)
{
System.out.println("String Handlingfuction menu:");
System.out.println("1.charAt()=it returns a character at aspecifird position");
System.out.println("2.equals()=it compare the two given string and return a boolen,that is True or flase");
System.out.println("3.length()=returns the length of a specifide string");
System.out.println("4.toLowerCase()=converts the string toLowercase letters");
System.out.println("5.toUpperCase()=converts the string toUppercase letters");
System.out.println("6.indexOf()=returns the first position of the character");
System.out.println("7.subString()=extract the substring based on index values,passed an arguments");
System.out.println("8.trim()=removes the whitespace from both ends of a string");
System.out.println("9.concat()=appends one string to the end of a string");
System.out.println("10.Exit from the program");
int choice=scn.nextInt();
switch(choice)
{
case 1:
String str="hello";
System.out.println("Character at given position is:"+str.charAt(1));
break;
case 2:
String s1="java";
String s2="java";
String s3="java";
System.out.println("Compare s1 and s2:"+s1.equals(s2));
System.out.println("Compare s1 and s3:"+s1.equals(s2));
break;
case 3:
String s4="uday kiran";
System.out.println("the length of String is:"+s4.length());
break;
case 4:
String s5="MCA";
System.out.println(s5.toLowerCase());
break;
case 5:
String s6="Palamaner ";
System.out.println(s6.toUpperCase());
break;
case 6:
String s7="college";
System.out.println("har='g'Position is:"+s7.indexOf('g'));
break;
case 7:
String s8="MOTHER THERESA";
System.out.println(s8.substring(0));
System.out.println(s8.substring(3));
break;
case 8:
String s9="Good morning broo";
System.out.println(s9.trim());
break;
case 9:
String str1="Good";
System.out.println(str1.concat("Afternoon"));
break;
case 10:
System.out.println("exiting from the menu bye........");
System.exit(0);
break;
default:
System.out.println("option invalid,please select valid option");
break;
}
}
}
}









