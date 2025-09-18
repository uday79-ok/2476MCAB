import java.util.*;
class DP
{
	public static int tph,howhung,cho,pos;
	public static int[] philname=new int[20],status=new int[20],hu=new int[20];
	public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("\n DINING PHILOSOPHER PROBLEM \n");
System.out.println("\n enter the total no.of philosoper \n");
tph=sc.nextInt();
for(int i=0;i<tph;i++)
{
philname[i]=i+1;
status[i]=1;
}
System.out.println("how many are hungry");
howhung=sc.nextInt();
if(howhung==tph)
{
System.out.println("\n all are hungry..\n Deahd lock stage will occr");
System.out.println("exiting");
}
else
{
for(int i=0;i<howhung;i++)
{
System.out.println("enter philosoper position"+(i+1)+"p");
hu[i]=sc.nextInt();
status[hu[i]]=2;
}
}
do
{
System.out.print("1.one can eat at a time\t2.two can eat at a time\t3.exit\n enter your choice:");
cho=sc.nextInt();
switch(cho)
{
case 1:
one();
break;
case 2:
two();
break;
case 3:
System.out.println("1");
}
}
while(true);
}
public static int one()
{
int pos=0;
System.out.println("\n allow one philosoper to eat at any time\n");
for(int i=0;i<howhung;i++)
{
System.out.println("\n p is granted to eat"+philname[hu[pos]]);
for(int x=pos;x<howhung;x++)
{
System.out.println("\n p is waiting"+philname[hu[x]]+"is waiting");
}
}
return 0;
}
public static int two()
{
int s=0,t,r;
System.out.println("\n allow two philosoper to eat at any time\n");
for(int i=0;i<howhung;i++)
{
for(int j=i+1;j<howhung;j++)
{
if(Math.abs(hu[i]-hu[j])>=1 && Math.abs(hu[i]-hu[j])!=4)
{
System.out.println("\n \ncombination"+(s+1));
t=hu[i];
r=hu[i];
s++;
System.out.println("\n p is granted to eat"+philname[hu[pos]]+"p"+philname[hu[j]]+"eat");
for(int x=pos;x<howhung;x++)
{
if(hu[x]!=t && hu[x]!=r)
{
System.out.println("\n p is waiting"+philname[x]+"i");
}
}
}
}
}
return 0;
}
}




