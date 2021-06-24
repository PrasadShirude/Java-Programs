/*

*/
import java.util.*;

class StringDemo
{
	public void Display(String str)
	{
		char c[] = str.toCharArray();
		for(int i =0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}

	public int Capital(String str)
	{	
		int iCnt = 0;
		char crr[] = str.toCharArray();
		for(int i =0;i<crr.length;i++)
		{
			if((crr[i] >= 'A') && (crr[i] <= 'Z'))
			{
				iCnt++;
			}
		}
		return iCnt;
	}

	
}

class Program202
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter string 1 : ");
		String str1 = sobj.nextLine();

		System.out.print("Enter string 2 : ");
		String str2 = sobj.nextLine();

		StringDemo sd = new StringDemo();
		sd.Display(str1);

		int iRet = sd.Capital(str1);
		System.out.print("Total capital is : "+iRet);


	}
}