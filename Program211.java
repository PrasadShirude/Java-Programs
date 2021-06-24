import java.util.*;
import Marvellous.Matrix;


class Program211
{
	public static void main(String args[])
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

