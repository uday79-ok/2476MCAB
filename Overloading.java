import java.util.Scanner;

public class Overloading
{
public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
Multiplication m = new Multiplication();
while(true)
{
System.out.println("1.Two Numbers Multipplication");
System.out.println("2.Three Numbers Multipplication");
System.out.println("3.Exit From The Program");
System.out.println("Select Ur Choice");
int choice = scn.nextInt();
switch(choice)
{
case 1:
System.out.println("Enter First Number");
int n1 = scn.nextInt();
System.out.println("Enter Second Number");
int n2 = scn.nextInt();
m.mul(n1,n2);
break;
case 2:
System.out.println("Enter First Number");
int num1 = scn.nextInt();
System.out.println("Enter Second Number");
int num2 = scn.nextInt();
System.out.println("Enter Third Number");
int num3 = scn.nextInt();
m.mul(num1,num2,num3);
break;
case 3:
System.out.println("Exiting From The Program..!");
System.exit(0);
break;
default:
System.out.println("Please Choose a Valid Option");
break;
}
}
}
}
class Multiplication
{
public void mul(int n1,int n2)
{
int res = n1*n2;
System.out.println("Product of "+n1+" and "+n2+" is: "+res);
}
public void mul(int num1,int num2,int num3)
{
int mul = num1*num2*num3;
System.out.println("Product of "+num1+","+num2+" and "+num3+" is: "+mul);
}
}


