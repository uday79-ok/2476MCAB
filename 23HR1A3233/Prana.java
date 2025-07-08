import java.util.Scanner;
class Prana
{
int binarysearch(int array[],int element,int low,int high)
{
while(low<=high)
{
int mid=low+(high-low)/2;
if(array[mid]==element)
return mid;
if(array[mid]<element)
low=mid+1;
else
high=mid-1;
}
return-1;
}
public static void main(String args[])
{
Prana obj=new Prana();
int[]array={3,4,5,6,7,8,9};
int n=array.length;
Scanner input=new Scanner(System.in);
System.out.println("enter element to be searched:");
int element=input.nextInt();
input.close();
int result=obj.binarysearch(array,element,0,n-1);
if(result==-1)
System.out.println("NOT FOUND");
else
System.out.println("ELEMENTS FOUND AT INDEX"+result);
}
}