class Method
{
void method1(int x,int y)
{
System.out.println(x+y);
}
void method2(int x,int y,int z)
{
System.out.println(x*y*z);
}
void method3()
{
System.out.println("Hello world");
}
public static void main(String args[])
{
Method A=new Method();
A.method1(4,5);
A.method2(5,6,7);
A.method3();
}
}


