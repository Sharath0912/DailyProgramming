package Arrays1;

public class MergeTwoArrays 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9};
		
		int arr[]=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			arr[i]=a[i];
		}
		
		for(int i=0;i<b.length;i++)
		{
			arr[a.length+i]=b[i];
		}
		
		
	}
}
