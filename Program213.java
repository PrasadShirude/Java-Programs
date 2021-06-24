import java.util.*;
import Marvellous.Matrix;


class Demo extends Matrix
{
	public Demo(int iRow,int iCol)
	{
		super(iRow,iCol);
	}
	public int Maximum()
	{
		int iMax = Arr[0][0];
	
		for(int i = 0;i<Arr.length;i++)
		{
			for(int k = 0;k<Arr[i].length;k++)
			{
				if(Arr[i][k] > iMax)
				{
					iMax = Arr[i][k];
				}
			}
		}
		return iMax;
	}

	public int Minimum()
	{
		int iMin = Arr[0][0];
	
		for(int i = 0;i<Arr.length;i++)
		{
			for(int k = 0;k<Arr[i].length;k++)
			{
				if(Arr[i][k] < iMin)
				{
					iMin = Arr[i][k];
				}
			}
		}
		return iMin;
	}

	public void MaximumRow()
	{
		int iMax = Arr[0][0];
	
		for(int i = 0;i<Arr.length;i++)
		{	
			iMax = Arr[i][0];
			for(int k = 0;k<Arr[i].length;k++)
			{
				if(Arr[i][k] > iMax)
				{
					iMax = Arr[i][k];
				}
			}
			System.out.println("Maximum element in "+ i+"th Row is "+iMax);
		}
	}

	public void SummationRow()
	{
		int iSum = 0;
	
		for(int i = 0;i<Arr.length;i++)
		{	
			iSum = 0;
			for(int k = 0;k<Arr[i].length;k++)
			{			
					iSum = iSum + Arr[i][k];
			}
			System.out.println("Summation  element in "+ (i+1)+"th Row is "+iSum);
		}
	}
}
class Program213
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

		int iRet = dobj.Maximum();
		System.out.println("Maximum elements is : "+iRet);

		int iRet2 = dobj.Minimum();
		System.out.println("Maximum elements is : "+iRet2);

		dobj.MaximumRow();
		dobj.SummationRow();
		System.gc();
	}
}