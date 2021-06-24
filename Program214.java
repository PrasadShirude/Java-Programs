import java.util.*;
import Marvellous.Matrix;


class Demo extends Matrix
{
	public Demo(int iRow,int iCol)
	{
		super(iRow,iCol);
	}
	
	public int AddBorder()
	{
		int iSum = 0;
	
		for(int i = 0;i<Arr.length;i++)
		{
			for(int k = 0;k<Arr[i].length;k++)
			{
				//if((i == 0) || (i == iRow-1) || (k == 0) || (k == iCol-1))
				if((i == 0) || (i == Arr.length-1) || (k == 0) || (k == Arr.length-1))
				{
					iSum =iSum + Arr[i][k];
				}
			}
		}
		return iSum;
	}
	
}
class Program214
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

		int iRet = dobj.AddBorder(iRows,iCol);
		System.out.println("Addition of border elements is : "+iRet);

		
		System.gc();
	}
}