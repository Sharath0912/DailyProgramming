package ArraysProgram_1D;

public class Duplicate {

	public void isDuplicate(int[] arr) 
	{
		System.out.println("Duplicate Elements Are :");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
	}

}
