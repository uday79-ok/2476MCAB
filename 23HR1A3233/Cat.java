class Cat
{
public static void main(String args[])
{
try
{
System.out.println("::tryblock::");
int data=125/5;
System.out.println("result:"+data);
}
catch(NullPointerException e)
{
System.out.println("::catch block::");
System.out.println(e);
}
finally
{
System.out.println("::finally block::");
System.out.println("no exception :: finally block executed");
}
System.out.println("the rest of the code");
}
}