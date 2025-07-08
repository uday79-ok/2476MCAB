class childThreadimpleamentrunnable
{
Thread t;
child thread(string name)
{
t=new thread(this,name);
t.start();
}
public void run()
{
for(int i=1;i<5;i++)
{
try
{
if(t.getName().equals("first thread"))
{
threaf.sleep(1000);
System.out.println(t.getName()+",Good morning");
}
else if(t.getName().equals("second thread"))
{
thread.sleep(2000);
System.out.println(t.getName()+"Hello");
}
else
{
thread.sleep(3000);
System.out.println(t.getName()+"is interrupted");
}
}
catch(InterreputedException e)
{
System.out.println(t.getName()+"is interrupted");
}
}
}
}
class Threethreads
{
public static void main(String args[])
{
childthread one=new childthread("first thread");
childthread two=new childthread("second thread");
}
}