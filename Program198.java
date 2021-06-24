/*
 Accept number from user and find out generic root of that number 

Input = 927
Output = 9+2+7 = 18 = 1+8 = 9

9975-> 30 -> 3
89457 -> 33 -> 6
8 -> 8
*/


import java.util.*;

class Digits
{	
	int GenRoot(int iNo)
	{		
		int iSum = iNo;
		while(iSum > 10)
		{	
			iNo = iSum;
			iSum = 0;
			while(iNo != 0) 
			{	
				iSum = iSum + (iNo % 10);
				iNo = iNo/10;
			}
			
		}
		return iSum;
	}
}

class Program198
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
			
		System.out.print("Enter number : ");
		int iNo = sobj.nextInt();

		Digits dobj = new Digits();


		int iRet = dobj.GenRoot(iNo);
		System.out.print("Generic root of "+iNo+" is "+iRet);
	}
}

