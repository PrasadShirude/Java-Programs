/*
4. Equilibrium index of an array

Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes. For example, in an arrya A:

A[0] = -7, A[1] = 1, A[2] = 5, A[3] = 2, A[4] = -4, A[5] = 3, A[6]=0
3 is an equilibrium index, because: 
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]

6 is also an equilibrium index, because sum of zero elements is zero, i.e.,
A[0] + A[1] + A[2] + A[3] + A[4] + A[5]=0

7 is not an equilibrium index, because it is not a valid index of array A.

Write a function int equilibrium(int[] arr, int n); that given a sequence
arr[] of size n, returns an equilibrium index (if any) or -1 if no equilibrium
indexes exist.

*/

import java.util.*;

class Equillibrium
{
	public int  equillibrium(int arr[])
	{
		int i = 0;
		int sum = 0;
		int leftsum = 0;
		for(i=0;i<arr.length;i++)
			sum += arr[i];

		for(i=0;i<arr.length;i++)
		{
			sum -= arr[i];

			if(leftsum == sum)
				return i;

			leftsum += arr[i];
		}
		return -1;
	}

}
class Ass59_4
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

		Equillibrium eobj = new Equillibrium();

		

		System.out.print("Equillibrium index is  : "+eobj.equillibrium(arr));
	}	
}