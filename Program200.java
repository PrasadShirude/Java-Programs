/*
Sum of n elements of array 
*/
import java.util.*;

class Numbers
{
	public int Sum(int arr[])
	{
		int iSum = 0;
		for(int i =0;i<arr.length;i++)
		{
			iSum += arr[i];
		}
		return iSum;
	}
}
class Program200
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

		Numbers mobj = new Numbers();
		int iRet = mobj.Sum(arr);
		System.out.print("Addition is "+iRet);


	}
}