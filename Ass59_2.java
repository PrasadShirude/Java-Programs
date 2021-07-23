/*
59_2. Given an array arr[] of n integers, construct a Product Arrayprod[] (of same size) 
such that prod[i] is equal to the product of all the elements of arr[] except arr[i]. 
Solve it without division operator and in O(n).

arr[] = {10, 3, 5, 6, 2}
prod[] = {180, 600, 360, 300, 900}
*/

import java.lang.*;
import java.util.*;

class ProductArray
{
	public void product(int arr[],int n)
	{
		int left[] = new int[n];
		int right[] = new int[n];
		int prod[] = new int[n];

		left[0] = 1;
		right[n-1] = 1;

		for(int i=1;i<n;i++)
			left[i] = arr[i-1] * left[i-1];

		for(int j =n-2;j>=0;j--)
			right[j] = arr[j+1] * right[j+1];

		for(int i = 0;i<n;i++)
			prod[i] = left[i] * right[i];

		for(int i = 0;i<n;i++)
			System.out.print(prod[i]+"\t");

	}
}

class Ass59_2
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

		ProductArray pobj = new ProductArray();

		pobj.product(arr,size);

		
	}
}