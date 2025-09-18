import java.util.Scanner;
class QuickSort
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int length=sc.nextInt();
		int []arr=new int[length];
		System.out.println("Enter the elements");
		for(int i=0;i<length;i++)
		{
			arr[i]=sc.nextInt();
		}
		QuickSort q=new QuickSort();
		//int partition;
		q.quicksortRec(arr,0,length-1);
		System.out.println("Sorted Array");
		q.print(arr);
		sc.close();
	}
	 public int partition(int []arr,int low,int high)
	{
		int pivot=arr[(low+high)/2];
		while(low<=high)
		{
			while(arr[low]<pivot)
			{
				low++;
			}
			while(arr[high]>pivot)
			{
				high--;
			}
			if(low<=high)
			{
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				low++;
				high--;
			}
		}
		return low;
		}
	void quicksortRec(int []arr,int low,int high)
	{
		int pi=partition(arr,low,high);
		if(low<pi-1)
		{
			quicksortRec(arr,low,pi-1);
		}
		if(pi<high)
		{
			quicksortRec(arr,pi,high);
		}
	}
	void print(int[]arr)
	{
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}