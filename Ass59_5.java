/*
5. Pythagorean Triplet in an array

Given an array of integers, write a function that 
returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2.

Example:
Input: arr[] = {3, 1, 4, 6, 5}
Output: True
There is a Pythagorean triplet (3, 4, 5).

Input: arr[] = {10, 4, 6, 12, 5}
Output: False
There is no Pythagorean triplet.
*/

import java.util.*;

class PythTriplet
{
	public boolean triplet(int arr[],int n)
	{
		int x = 0,y=0,z =0;

		for(int i =0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1; k<n;k++)
				{
					x = arr[i]*arr[i];
					y = arr[j]*arr[j];
					z = arr[k]*arr[k];

					if(x == y+z || y == x+z || z == x+y)
						return true;
				}
			}
		}
		return false;
	}

}
class Ass59_5
{
	public static void main(String argsp[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter no.of elements : ");
		int size = sobj.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter elements : ");
		for(int i =0;i<size;i++)
		{
			arr[i] =sobj.nextInt();
		}

		PythTriplet pobj = new PythTriplet();

		boolean bRet = false;

		bRet = pobj.triplet(arr,size);

		if(bRet == true)
		{
			System.out.println("There is a pythagoras triplet");
		}
		else
		{
			System.out.println("There is no pythagoras triplet");
		}

		
	}	
}