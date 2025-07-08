abstract class Shape
{
private double width;
private double height;
public Shape(double width,double height)
{
this.width=width;
this.height=height;
}
public final double getWidth()
{
return height;
}
abstract double getArea();
}
class Rectangle extends Shape
{
public Rectangle(double width,double height)
{
super(width,height);
}
final double getArea()
{
return this.getHeight()*this.getWidth();
}
}
public class Test
{
public static void main(String args[])
{
Shape s1=new Rectangle(10,20);
Shape s2=new Square(10);
System.out.println("width of s1:"+s1.getWidth());
System.out.println("height of s1:"+s1.getHeight());
System.out.println("width of s2:"+s2.getwidth());
System.out.println("height of s2:"+s2.getHeight());
System.out.println("area of s1:"+s1.getArea());
System.out.println("area of s1:"+s1.geArea());
}
}