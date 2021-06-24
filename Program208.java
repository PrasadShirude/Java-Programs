// Accept matrix and return addition of all elements of every elements

import java.util.*;

class Matrix
{
	public int AddMatix(int Arr[][])
	{	
		int iRet = 0;
		for(int i = 0;i<Arr.length;i++)
		{
			for(int k = 0;k<Arr[i].length;k++)
			{
				iRet = iRet + Arr[i][k];
			}
		}
		return iRet;
	}
}

class Program208
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter no.of rows : ");
		int iRows = sobj.nextInt();

		System.out.print("Enter no.of columns : ");
		int iCol = sobj.nextInt();

		int Arr[][] = new int[iRows][iCol];

		System.out.println("Enter elements : ");
		for(int i = 0;i<Arr.length;i++)
		{
			for(int k = 0;k<Arr[i].length;k++)
			{
				Arr[i][k] = sobj.nextInt();
			}
		}

		System.out.println("Entered element are : ");
		for(int i = 0;i<Arr.length;i++)
		{
			for(int k = 0;k<Arr[i].length;k++)
			{
				System.out.print(Arr[i][k] +"\t");
			}
			System.out.print("\n");
		} 


		Matrix mobj = new Matrix();

		int iRet = mobj.AddMatix(Arr);
		System.out.println("Addition of all elements of matrix is : "+iRet);
		Arr = null;
	}
}