class And
{
And()
{
int a=3;
int b=5;
System.out.println(a+b);
}
And(int x,int y)
{
System.out.println(x+y);
}
And(int x,int y,int z)
{
System.out.println(x*y*z);
}
public static void main(String args[])
{
And a=new And();
And b=new And (78,54);
And c=new And(5,4,9);
}
}