class anonymous
{
int b;
void msg()
{
System.out.println("Welcome");
}
}
class parent
{
public static void main(String args[])
{
anonymous p1=new anonymous();
p1.b=10;
System.out.println(p1.b);
p1.msg();
anonymous p2=new anonymous()
{
void msg()
{
System.out.println("anonymous inner class");
}
};
p2.msg();
}
}
