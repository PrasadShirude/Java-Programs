/*
Addition of perfect numbers
*/

import java.util.*;

class Numbers
{
	public int PerfectNumber(int arr[])
	{
		int iSum = 0, itol = 0;
		for(int i =0;i<arr.length;i++)
		{	
			for(int k = 1;k<=(arr[i]/2);k++)
			{	
				if((arr[i]%k) == 0)
				{
					iSum += k;
				}
			}
			if(iSum == arr[i])
			{
				itol += arr[i];
			}
			iSum = 0;
		}
		return itol;
	}
}
class Program201
{
	public static void main(String args[])
	{	
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter size : ");
		int iSize = sobj.nextInt();

		int arr[] = new int[iSize];
		
		System.out.print("Enter elements : ");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = sobj.nextInt();
		}

		Numbers nobj = new Numbers();
		int iRet = nobj.PerfectNumber(arr);
		System.out.print("Addition is "+iRet);


	}
}