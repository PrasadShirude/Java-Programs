/*
Java program to find Maximum difference between two
elements such that larger element appears after the smaller number

Examples:
If array is [2, 3, 10, 6, 4, 8, 1] then returned value should be 8 (Diff between 10 and 2).

If array is [ 7, 9, 5, 6, 3, 2 ] then returned value should be 2 (Diff between 7 and 9)

*/

import java.lang.*;
import java.util.*;

class MaxDiff
{
	public static int Difference(int arr[],int size)
	{
		int iMax = arr[1] - arr[0];

		for(int i =0;i<size;i++)
		{
			for(int j =i+1;j<size;j++)
			{
				if((arr[j]-arr[i])>iMax)
				{
					iMax = arr[j]-arr[i];
				}
			}
		} 
		return iMax;
	}
}

class Ass59_1
{
	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter no.of elements : ");
		int size = sobj.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter elements : ");
		for(int i =0;i<size;i++)
		{
			arr[i] = sobj.nextInt();
		}

		MaxDiff mobj = new MaxDiff();

		int iRet = MaxDiff.Difference(arr,size);

		System.out.print("Maximum Difference is : "+iRet);
	}
}