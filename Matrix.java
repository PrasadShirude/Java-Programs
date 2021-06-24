// javac Matrix.java -d .

// -d . -> means make folder in the current directory
// -d .. -> measn make folder in the parent directory

package Marvellous;

import java.util.*;

public class Matrix
{
	public int Arr[][];

	public Matrix(int iRow,int iCol)
	{
		Arr = new int[iRow][iCol];
	}
	protected void finalize()
	{
		Arr = null;
	}

	public void Accept()
	{	
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter elements : ");
		for(int i = 0;i<Arr.length;i++)
		{
			for(int k = 0;k<Arr[i].length;k++)
			{
				Arr[i][k] = sobj.nextInt();
			}
		}
	}

	public void Display()
	{
		System.out.println("Entered element are : ");
		for(int i = 0;i<Arr.length;i++)
		{
			for(int k = 0;k<Arr[i].length;k++)
			{
				System.out.print(Arr[i][k] +"\t");
			}
			System.out.print("\n");
		} 
	}
 } 

