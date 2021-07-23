/*

3. Segregate Even and Odd numbers

Given an array A[], write a function that segregates even and odd numbers. 
The functions should put all even numbers first, and then odd numbers.

Example
Input = {12, 34, 45, 9, 8, 90, 3}
Output = {12, 34, 8, 90, 45, 9, 3}
*/
import java.util.*;

class SegragateArray
{
	public void Segragate(int arr[])
	{	
		
		int n = arr.length;
		/*  Solution 1
		int brr[] = new int[n];

		int j = 0,k =n-1;
		for(int i =0;i<n;i++) 
		{
			if(arr[i]%2 == 0)
			{
				brr[j] = arr[i];
				j++;
			}
			else 
			{
				brr[k] = arr[i];
				k--;
			}	
		}

		for(int i =0;i<n;i++)
		{
			System.out.print(brr[i]+"\t");
		}

		*/

		// Solution 2

		int left = 0,right =n-1;

		while(left < right)
		{
			while((arr[left]%2 == 0) &&(left < right))
				left++;

			while((arr[right]%2 == 1) &&(left < right))
				right--;

			if(left < right)
			{
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}	 
		}
	}	
}

class Ass59_3
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

		SegragateArray aobj = new SegragateArray();

		aobj.Segragate(arr);

		for (int i = 0; i < arr.length; i++)
		System.out.print(arr[i]+" ");
	}	
}