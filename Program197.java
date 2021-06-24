import java.io.*;
import java.util.*;

/*
1 1 1 1 1 
3 _ _ _ 3
5 _ _ _ 5
7 _ _ _ 7
9 9 9 9 9

11 12 13 14 15
21 22 23 24 25
31 32 33 34 35
41 42 43 44 45
51 52 53 54 55
*/
class Pattern
{
	void Display(int iRow,int iCol)
	{	
		int i = 0, k = 0, no = 1;
		for(i = 1;i<=iRow;i++)
		{
			for(k =1; k <= iCol;k++)
			{	
				if((i == 1) || (k == 1) || ( i == iRow) || (k == iCol))
				{
					System.out.print(no+"\t");
				}
				else
				{
					System.out.print(" \t");	
				}
			}
			no = no + 2;
			System.out.print("\n");
		}
	}
}

class Program197
{	
	
	public static void main(String args[])
	{	

		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter no.of rows : ");
		int iRow = sobj.nextInt();

		System.out.print("Enter no.of columns : ");
		int iCol = sobj.nextInt();

		Pattern pobj = new Pattern();

		pobj.Display(iRow,iCol);

	}
}