import java.util.*;
import Marvellous.Matrix;


class Demo extends Matrix
{
	public Demo(int iRow,int iCol)
	{
		super(iRow,iCol);
	}
	
	public void Forest()
	{
		for(int i =1;i<Arr.length-1;i++)
		{
			for(int j =1;j<Arr[i].length-1;j++)
			{
					
				if(Arr[i][j] == (Arr[i-1][j-1]+Arr[i-1][j]+Arr[i-1][j+1]+Arr[i][j+1]+
					Arr[i+1][j+1]+Arr[i+1][j]+Arr[i+1][j-1]+Arr[i][j-1]))
				{
					System.out.println("Forest element is : "+Arr[i][j]);
				}

			}
		}
	}
}
	

class Program215
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter no.of rows : ");
		int iRows = sobj.nextInt();

		System.out.print("Enter no.of columns : ");
		int iCol = sobj.nextInt();

		Demo dobj = new Demo(iRows,iCol);

		dobj.Accept();
		dobj.Display();

		dobj.Forest();

		
		System.gc();
	}
}

/*
		0		1 		2 		3 		4 		5

	0	5       6       8       3       4       2
	1	8       6       7       2       1       2
	2 	1       29      2       3       1       0
	3	1       2       2       7       25      3
	4	3       0       1       4       2       5

Arr[3][4] = Arr[2][3]+Arr[2][4]+Arr[2][5]+Arr[3][3]+Arr[3][5]+Arr[4][3]+Arr[4][4]+Arr[4][5]
			Arr[i-1][k-1]+Arr[i-1][k]+Arr[i-1][k+1]+Arr[i][k-1]+Arr[i][k+1]+Arr[i+1][k-1]+
			Arr[i+1][k]+Arr[i+1][k+1]						





					if(Arr[i][k] == (Arr[i-1][k-1]) + (Arr[i-1][k=1]) + (Arr[i-1][k=2])+(Arr[i][k-1])
						+(Arr[i][k=1]) + Arr[i+1][k-1] + Arr[i+1][k] + Arr[i+1][k+1])
					{

					}
					
				//if(Arr[i][k] == Arr[i-1][k-1]+Arr[i-1][k]+Arr[i-1][k+1]+Arr[i][k+1]+
				//	Arr[i+1][k+1]+Arr[i+1][k]+Arr[i+1][k-1]+Arr[i][k-1])
*/