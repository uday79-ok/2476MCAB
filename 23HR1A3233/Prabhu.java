public class Prabhu
{
public static void main(String args[])
{
try
{
int data=100/10;
}
catch(ArithmeticException e)
{
System.out.println(e);
}
System.out.println("rest of the code..");
}
}