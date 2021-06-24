// 
import java.util.*;

class Matrix
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

class Program209
{
	public static void main(String ars[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter no.of rows : ");
		int iRows = sobj.nextInt();

		System.out.print("Enter no.of columns : ");
		int iCol = sobj.nextInt();

		Matrix mobj = new Matrix(iRows,iCol);

		mobj.Accept();
		mobj.Display();

		System.gc();
	}
}