import java.util.Scanner;
class Polymo
{
	public static void main(String args[])
	{
poly();
	}
static void poly()
{
while(true)
	{
	System.out.println("POLYMORPHISM");
	System.out.println("1.Method Overloading");
	System.out.println("2.Method Overriding");
	System.out.println("3.Constructor");
	System.out.println("4.exit");
  System.out.println("enter your choice from 1 to 4");
  Scanner sc=new Scanner(System.in);
  int choice=sc.nextInt();
  switch(choice)
		{
         case 1:
              add p=new add();
		      p.add(10,20,90);
			  p.add(10.10,20.20);
			  
		       break;
		 
		 case 2:
			 Animal myAnimal;
		 myAnimal=new Dog();
		   myAnimal.sound();
		 myAnimal=new Lion();
		   myAnimal.sound();
		 myAnimal=new Cat();
		   myAnimal.sound();

			 break;

		 case 3:
                      Uday u=new Uday();
                      Uday u1=new Uday(9);
                      Uday u2=new Uday("ko",90);
			 break;
		  
		  case 4:
			  System.exit(0);
			  break;

		  default:
		}
  
	}
}
}
class add 
{

public int add(int a,int b,int c)
{
	int d=a+b+c;
	System.out.println(d);
	return d;
}
public double add(double g,double h)
{
	double f=g+h;
	System.out.println(f);
	return f;
}
}
class Animal
{
    public void sound()
	{
		System.out.println("Animals makes sound");
	}
}
class Dog extends Animal
{
@Override
	public void sound()
	{
        System.out.println("dog barks");
	}
}
class Lion extends Animal
{
@Override
	public void sound()
	{
		System.out.println("boy playing cricket");
	}
}
class Cat extends Animal
{
@Override
	public void sound()
	{
		System.out.println("SSMB29 Mahesh babu next movie in 2027");
	}
}
class Bat
{
	String brand;
	int price;
	String player;
}
 class Uday
{
Uday()
{
System.out.println("Testing tools");
}
Uday(int a)
{
System.out.println("the Test is completed");
}
Uday(String a,int b)
{
System.out.println("Hello google.....");
}
}