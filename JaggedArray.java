import java.util.*;
import java.io.*;

class JaggedArray
{
	public static void main(String ars[])
	{
		int arr[][] = new int[3][];
	
		arr[0] = new int[3];
		arr[1] = new int[5];
		arr[2] = new int[2];
		int count = 0,i = 0,k = 0;
		for(i =0;i<arr.length;i++)
		{
			for(k=0;k<arr[i].length;k++)
			{
				arr[i][k]=count++;
			}
		}
		
		for(i =0;i<arr.length;i++)
		{
			for(k=0;k<arr[i].length;k++)
			{
				System.out.print(arr[i][k]+" ");
				
			}
			System.out.println();
		}
	}
}