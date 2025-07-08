class Sk
{
int a=120;
}
class Sk1 extends Sk
{
int a=180;
void display()
{
System.out.println("a is:"+super.a);
}
}
class Superkeyword
{
public static void main(String[]args)
{
Sk1 s=new Sk1();
s.display();
}
}
 