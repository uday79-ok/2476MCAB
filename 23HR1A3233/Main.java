class InvalidAgeException extends Exception
{
public InvalidAgeException(String str)
{
super(str);
}
}
public class Main
{
static void validate(int age)throws InvalidAgeException
{
if(age<18)
{
throw new InvalidAgeException("age is not validate vote");
}
else
{
System.out.println("welcome to vote");
}
}
public static void main(String args[]);
{
try
{
validate(25);
}
catch(InvalidAgeException ex)
{
System.out.println("caught the exception");
System.out.println("Exception occured:"+ex);
}
}
}                           