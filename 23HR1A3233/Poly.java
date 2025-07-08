class Shape
{
void draw()
{
System.out.println("Creating");
}
}
class Square extends Shape
{
void draw()
{
System.out.println("Creating Square....");
}
}
class Triangle extends Shape
{
void draw()
{
System.out.println("Creating Triangle...");
}
}
class Pentagon extends Shape
{
void draw()
{
System.out.println("Creating Pentagon...");
}
}
class Poly
{
public static void main(String args[])
{
Shape s;
s=new Square();
s.draw();
s=new Triangle();
s.draw();
s=new Pentagon();
s.draw();
}
}
