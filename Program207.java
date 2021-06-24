import java.util.*;

class Program207
{
	public static void main(String str[])
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

		Arr = null;


	}	
}