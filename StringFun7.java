//Design and develop a program String Handling Functions
import java.util.Scanner;
class StringFun
{
public static void main(String[] args)
{
menu();
}
static void menu()
{
Scanner scn = new Scanner(System.in);
while(true)
{
System.out.println("String Handling Functions Menu: ");
System.out.println("1. charAt() --> It returns a character at a specified position.");
System.out.println("2. equals() -->It compares the two given strings and returns a Boolean, that is, True or False.");
System.out.println("3. length() --> Returns the length of a specified string.");
System.out.println("4. toLowerCase() --> Converts the string to lowercase letters.");
System.out.println("5. toUpperCase() --> Converts the string to uppercase letters.");
System.out.println("6. indexOf() --> Returns the first found position of a character.");
System.out.println("7. substring() --> Extracts the substring based on index values, passed as an argument.");
System.out.println("8. trim() --> Removes the whitespace from both ends of a string.");
System.out.println("9. concat() --> Appends one string to the end of another.");
System.out.println("10.Exit from the Program");
System.out.println("Choose Your Choice");
int choice = scn.nextInt();
switch(choice)
{
case 1:
String str="Hello";
System.out.println("Character at given position is: "+str.charAt(1));//e
break;
case 2:
String s1="Java";
String s2="Java";
String s3="java";
System.out.println("Compare s1 and s2: "+s1.equals(s2)); //true
System.out.println("Compare s1 and s3: "+s1.equals(s3)); //false
break;
case 3:
String s4="India";
System.out.println("The length of String is "+s4.length());//3
break;
case 4:
String s5="MCA";
System.out.println(s5.toLowerCase());
break;
case 5:
String s6="andhra pradesh";
System.out.println(s6.toUpperCase());
break;
case 6:
String s7="College";
System.out.println(" Char -->'g' position is "+s7.indexOf('g'));
break;
case 7:
String s8="MOTHER THERESA";
System.out.println(s8.substring(0,6));//MOTHER
System.out.println(s8.substring(3)); //HER THERESA
break;
case 8:
String s9=" Good Morning ";
System.out.println(s9.trim());//Good Morning
break;
case 9:
String str1="Good";
System.out.println(str1.concat(" AfterNoon"));
break;
case 10:
System.out.println("Exiting From the Menu Bye....!!");
System.exit(0);
break;
default:
System.out.println("Option Invalid,Please Select Valid Option");
break;
}
}
}
}



