interface Add_sub
{
public void add(double x,double y);
}
interface Mul_div
{
public void multiply(double x,double y);
public void divide(double x,double y);
}
interface Calculator extends Add_sub,Mul_div
{
public void printResult(double result);
}
public class Mycalculator implements Calculator
{
public void add(double x,double y)
{
double result=x+y;
printResult(result);
}
public void subtract(double x,double y)
{
double result=x-y;
printResult(result);
}
public void divide(double x,double y)
{
double result=x/y;
printResult(result);
}
public void multiply(double x,double y)
{
double result=x*y;
printResult(result);
}public void printResult(double result)
{
System.out.println("the result is :"+result);
}
public static void main(String args[])
{
Mycalculator c=new Mycalculator();
c.add(4,7);
c.subtract(3,98);
c.divide(2,7);
c.multiply(5,8);
}
}
