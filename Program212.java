import java.util.*;
import Marvellous.Matrix;


class Demo extends Matrix
{
	public Demo(int iRow,int iCol)
	{
		super(iRow,iCol);
	}
	public int Addition()
	{
		int iSum = 0;
		for(int i = 0;i<Arr.length;i++)
		{
			for(int k = 0;k<Arr[i].length;k++)
			{
				iSum = iSum + Arr[i][k];
			}
		}
		return iSum;
	}
}
class Program212
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

		int iRet = dobj.Addition();
		System.out.println("Addition is : "+iRet);
		System.gc();
	}
}