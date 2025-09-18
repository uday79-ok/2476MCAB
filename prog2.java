
import java.util.Scanner;

class ControlStructures
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
System.out.println("Menu: Control Statements");
System.out.println("1.Conditional Statements");
System.out.println("2.Loops");
System.out.println("3.Jumping Statements");
System.out.println("4.Exit From the Menu");
System.out.println("Enter a Choice");
int choice = scn.nextInt();
switch(choice)
{
case 1:
conditionalStatements();
break;
case 2:
loops();
break;
case 3:
controlStatements();
break;
case 4:
System.out.println("Exiting From the Menu Bye....!!");
System.exit(0);
break;
default:
System.out.println("Option Invalid,Please Select Valid Option");
break;
}
}
}
static void conditionalStatements()
{
Scanner scn = new Scanner(System.in);
while(true)
{
System.out.println("Choose the Conditional Statement from the following");
System.out.println("1.If");
System.out.println("2.Nested If");
System.out.println("3.Back to main Menu");
int ch = scn.nextInt();
switch(ch)
{
case 1:
System.out.println("Here We Use if condition to Know the Greatest Numbers Between two Numbers");
System.out.println("Enter First Number");
int a = scn.nextInt();
System.out.println("Enter Second Number");
int b = scn.nextInt();
if(a>b)
{
System.out.println(a+" is Bigger");
}
else
{
System.out.println(b+" is Bigger");
}
break;
case 2:
//System.out.println("Here We use nested if to Know ");
System.out.println("If we want to check two or more conditions at a time,on that time we use nested if");
System.out.println("Here we can give time it can check either morning or afternoon or evening or night by using nested if");
System.out.println("Enter Time");
int time = scn.nextInt();
if(time<=10)
{
System.out.println("Morning");
break;
}
else if(time>10 && time<=16)
{
System.out.println("Afternoon");
break;
}
else if(time>16 && time<=24)
{
System.out.println("Night");
break;
}
else
{
System.out.println("Invalid Time");
break;
}
case 3:
menu();
break;
default:
System.out.println("Select Valid Option");
break;
}
}
}
static void loops()
{
Scanner scn = new Scanner(System.in);
while(true)
{
System.out.println("Choose the  loop from the following");
System.out.println("1.for loop");
System.out.println("2.while");
System.out.println("3.do while");
System.out.println("4.for each");
System.out.println("5.Back to Main Menu");
int l = scn.nextInt();
switch(l)
{
case 1:
System.out.println("Here We use for loop to find factorial Number");
System.out.println("Enter a Number");
int n = scn.nextInt();
int fact = 1;
for(int i=1;i<=n;i++)
{
fact = fact*i;
}
System.out.println(n+"! = "+fact);
break;
case 2:
System.out.println("Here we use While loop for finding LCM of  two  Numbers");
System.out.println("Enter first Number");
int a = scn.nextInt();
System.out.println("Enter Second Number");
int b = scn.nextInt();
int c = a>b?a:b;
while(true)
{
if(c%a==0 && c%b==0)
{
break;
}
c++;
}
System.out.println("LCM of "+a+" and "+b+" is: "+c);
break;
case 3:
System.out.println("Here  we use do while for printing atleast One statment before Entering into a loop");
int k=3;
do {
System.out.println("Hi");
}while(k<3);
System.out.println("Here we can print Hi in before while condition statement");
break;
case 4:
System.out.println("Here We use for each loop for printing Array Elements");
System.out.println("Enter size of an Array");
int size = scn.nextInt();
int[] arr = new int[size];
for(int i=0;i<size;i++)
{
System.out.println("Enter a Number at the index "+i+" is:");
arr[i] = scn.nextInt();
}
System.out.println();
for(int s:arr)
{
System.out.print(s+" ");
}
System.out.println();
break;
case 5:
menu();
break;
default:
System.out.println("Invalid Option");

}
}
}
static void controlStatements()
{
Scanner scn = new Scanner(System.in);
while(true)
{
System.out.println("Choose Jumping Statement You Want");
System.out.println("1.break");
System.out.println("2.continue");
System.out.println("3.return");
System.out.println("4.Back to Main Menu");
int m = scn.nextInt();
switch(m)
{
case 1:
System.out.println("Here We use break Statement to break the condition when the condition is Satisfy");
System.out.println("Suppose we use one loop and pass loop values dynamically");
System.out.println("Enter Starting point of loop");
int s = scn.nextInt();
System.out.println("Enter Ending point of loop");
int e = scn.nextInt();
System.out.println("Enter Breaking point of loop");
int b = scn.nextInt();
for(int i=s;i<e;i++)
{
System.out.println(i);
if(i==b)
{
break;
}
}
System.out.println("In above Output break statement breaks the loop when the condition is satisfy");
break;
case 2:
System.out.println("Here We use continue statement");
System.out.println("continue is one of the control statements to control the particualr block of code,continue is skip the current iteration when the condition is satisfy");
System.out.println("Enter Starting point of loop");
int p = scn.nextInt();
System.out.println("Enter Ending point of loop");
int q = scn.nextInt();
System.out.println("Enter Breaking point of loop");
int r = scn.nextInt();
for(int i=p;i<=q;i++)
{
if(i==r) continue;
System.out.println(i);
}
System.out.println("In Above Output it skip the true statement and it continue till the loop ends");
break;
case 3:
System.out.println("return is a control statement is used in methods");
System.out.println("return is used to control to its calling method");
System.out.println("Souppose declare one method namely sum");
System.out.println("In That Method we can Give values to add");
System.out.println(sum());
System.out.println("Here Sum is the different method,we can call that method in this method,it returns result without the print statement");
break;
case 4:
menu();
break;
default:
System.out.println("Invalid Option,select valid Option");
break;

}
}
}
static int sum()
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter First Number");
int c = scn.nextInt();
System.out.println("Enter second Number");
int d = scn.nextInt();
int j = c+d;
return j;
}
}
