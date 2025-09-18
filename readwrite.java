import.java.util.concurrent.Semaphore;
class RW
{
static Semaphore readLock=new Semaphore(1);
static Semaphore writeLock=new Semaphore(1);
static int readCount=0;
static class Read implements Runnable
{
@Override
public void run()
{
try
{
readLock.acquire();
readCount++;
if(readCount==1)
{
writeLock.acquire();
}
readLock.release();
System.out.println("Thread"+Thread.currentThread().getName()+"is READING");
     Thread.sleep(1500);
System.out.println("Thread"+Thread.currentThread().getName()+"has FINISHED READING");
readLock.acqurie();
readCount--;
if(readCount==0)
{
writeLock.release();
}
readLock.release();
}
catch(InterruptedException e)
{
System.out.println("e.getMessage());
}

}
}
static class Read implements Runnable
{
@Override
public void run()
{
try
{
writeLock.acquire();
System.out.println("Thread"+Thread.currentThread().getName()+"is READING");
     Thread.sleep(2500);
System.out.println("Thread"+Thread.currentThread().getName()+"has FINISHED READING");
writeLock.release();
}
catch(Interrupted Exception e)
{
System.out.println("e.getMessage());
}
}
}
public static void main(String args[])
{
Read read=new Read();
Write write=new Write();
Thread t1=new Thread(read);
t1.SetName("Thread1");
Thread t2=new Thread(read);
t2.SetName("Thread2");
Thread t3=new Thread(write);
t3.SetName("Thread3");
Thread t4=new Thread(write);
t4.SetName("Thread4");
t1.start();
t2.start();
t3.start();
t4.start();
}
}














