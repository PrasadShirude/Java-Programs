import java.util.*;
import java.io.*;

class JaggesArray2
{
	public static void main(String ars[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no.of rows : ");
		int r = sc.nextInt();

		int arr[][] = new int[r][];
		int i =0, c =0,k =0;

		
		for(i=0;i<r;i++)
		{
			System.out.println("Enter no.of columns : ");
			c = sc.nextInt();
			arr[i] = new int[c];
			
			for(k =0;k<c;k++)
			{
				System.out.println("Enter elements : "+k);
				arr[i][k]=sc.nextInt();
			}

		}

		for(i=0;i<r;i++)
		{
			for(k =0;k<c;k++)
			{
				System.out.println(arr[i][k]+" ");
			}

		}
	
		
		
	}
}