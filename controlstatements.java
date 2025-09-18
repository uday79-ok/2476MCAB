import java.util.*;
import java.io.*;
class Controlstatements
{
public static void main(String args[])
{
control();
}
public static void control()
{
Scanner sc=new Scanner(System.in);
while(true)
{
System.out.println("....control statements List...... \n1 conditional \n2 Looping \n3 Jumping \n4 Exit \nEnter your choice");
int a=sc.nextInt();
switch(a)
{
case 1:
conditional();
break;
case 2:
looping();
break;
case 3:
jumping();
break;
case 4:
System.out.println(" Exited from control statements");
System.exit(0);
break;
default:
System.out.println("enter the correct choice");
}
}
}
}
   //conditonal
public static void conditional()
{
Scanner sc1=new Scanner(system.in);
while(true)
{
System.out.println(".......conditional statements....\n1 if \n2 if else \n3 if else if \n4 switch \n5exit \n enter your choice");
int a=sc1.nextInt();
switch(a)
{
case 1:
System.out.println("-if started-);
ifcon();
System.out.println("-if ended-");
break;
case 2:
System.out.println("-if else started-");
if els();
System.out.println("-if else ended-");
break;
case 3:
System.out.println("-if else if started-");
ifelf();
System.out.println("-if else if ended-);
break;
case 4:
System.out.println("-switch started-");
swit();
System.out.println("-switch ended-");
break;
case 5:
System.out.println("exited conditional statements");
control();
break;
default:
System.out.println("enter the correct chpice");
}
}
}
     //if
public static void ifcon()
{
Scanner sc2=new Scanner(System.in);
System.out.println("enter first value");
int a=sc2.nextInt();
System.out.println("enter second value");
int b=sc2.nextInt();
if(a!=b)
System.out.println("sum of two numbers:"+(a+b));
}
