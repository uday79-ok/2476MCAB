class P
{{
System.out.println("Koushik");
}
void outermethod()
{
System.out.println("Pranathi");
class Inner
{
void Innermethod()
{
System.out.println("inner class method");
}
}
Inner ob=new Inner();
ob.Innermethod();
}
public static void main(String args[])
{
P ob1=new P();
ob1.outermethod();
}
}