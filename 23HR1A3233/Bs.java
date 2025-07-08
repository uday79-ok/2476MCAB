public class Bs
{
static void bubblesort(int[]arr)
{
int n=arr.lenght;
int temp=0;
for(int i=0;i<n;i++)
{
for(int j=1;j<(n-1);j++)
{
temp=arr[j-1];
arr[j-1]=arr[j]
arr[j]=temp;
}
}
}
}
public static void main(String args[]);
{
int arr[]={3,65,76,23,65,12,94,80};
System.out.println("array Before Bubble sort");
for(int i=0;i<arr.lenght;i++)
{
System.out.print(arr[i]+" ");
}
}
}
