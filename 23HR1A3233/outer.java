class outer
{
 class Inner
{
void innermethod()
{
System.out.println("Inner");
}
}
void outermethod()
{
System.out.println("Outer");
}
public static void main(String args[])
{
outer ot=new outer();
ot.outermethod();
outer.Inner ot1=new outer().new Inner();
ot1.innermethod();
}
}