class Mary
{
public static void main(String args[])
{
int a=20,b=50;
int c=a++ + ++b;
int d=++a - ++b;
int e=a++ + b++;
int f=a++ - a--;
int h=--a - --a;                                          System.out.println(c=a++ + ++b);
System.out.println(d=++a - ++b);
System.out.println(a++ + b++);
System.out.println(f=a++ - a--);
System.out.println(h=--a - --a); 
}
}

