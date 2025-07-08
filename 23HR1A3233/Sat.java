public class Sat
{
public static void main(String args[])
{
try
{
int a[]=new int[2];
int b=0;
int c=1/b;
System.out.println("access element three:"+a[3]);
}

catch(ArithmeticException e)
{
System.out.println("Arithmetic Exception thrown :"+e);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array index  out of the bouond exception  thrown:"+e);
}
catch(Exception e)
{
System.out.println("exception thrown:"+e);
}
System.out.println("out of the code block");
}
}