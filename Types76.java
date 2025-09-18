import java.time.LocalDateTime;
import java.util.*;
class Types76
{
public static void main(String args[])
{
menu();
}
static void menu()
{
Scanner sc=new Scanner(System.in);
while(true)
{
System.out.println("Menu");
System.out.println("1.Wrapper Classes");
System.out.println("2.Number class");
System.out.println("3.Date & Time Class");
System.out.println("4.Calander Class");
System.out.println("5.Vector CLass");
System.out.println("6.Stack Class");
System.out.println("7.Exit");
System.out.println("Choose your choice");
int choice=sc.nextInt();
switch(choice)
{
case 1:
Integer a=new Integer(10);
int b=a;//unboxing
int c=a.intValue();
System.out.println(a+" "+b+" "+c);
break;
case 2:
Number b1=1234567;
System.out.println(b1.byteValue());
break;
case 3:
LocalDateTime d=LocalDateTime.now();
System.out.println(d);
break;
case 4:
Calendar cal=Calendar.getInstance();
System.out.println(cal.getTime());
cal.add(Calendar.YEAR,10);
System.out.println("10 years after "+cal.getTime());
cal.add(Calendar.MONTH,5);
System.out.println("5 Months after "+cal.getTime());
cal.add(Calendar.DATE,-15);
System.out.println("15 days before "+cal.getTime());
break;
case 5:
Vector v=new Vector(5);
v.add("Java");
v.add(10.74);
v.add(10);
v.add(1234.56);
System.out.println("Display Vector Elements "+v);
System.out.println("Display the vector elements "+v.get(3));
System.out.println("Display the Vector elements"+v.size());
System.out.println("Display the vector Elements "+v.remove(3));
break;
case 6:
Stack st=new Stack();
st.push(10);
st.push(20);
System.out.println("Display the elements "+st);
st.pop();
System.out.println("Display the elements "+st);
System.out.println(st.peek());
break;
case 7:
System.out.println("Exiting the Program");
System.exit(0);
break;
default:
System.out.println("Please choose valid Option ");
break;
}
}
}
}



