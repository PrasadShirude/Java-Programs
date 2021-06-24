/*
Accept number and check if its armstrong number 

153 = 1 + 125 + 27 = 153

*/


import java.util.*;

class Digits
{	
	
	boolean Armstrong(int iNo)
	{		
		int temp = iNo;
		int iNum = iNo;	
		int iCnt = 0;
		int iSum = 0;
		while(temp != 0)
		{	
			temp =temp/10;
			iCnt++;
		}

		while(iNo != 0)
		{	
			for(int i =1;i<=iCnt;i++)
			iSum = iSum + i*(iNo %10);
			iNo = iNo/10;
		}

		if(iSum == iNum)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	

	/*
	boolean Armstrong(int iNo)
	{
		int temp = 0,iCount =0,iDigit = 0,iSum =0,iPower = 1;
		while(temp != 0)
		{	
			temp =temp/10;
			iCount++;
		}
		temp = iNo;
		while(temp != 0)
		{
			iDigit = temp % 10;
			for(int i = 1;i<=iCount;i++)
			{
				iPower = iPower * iDigit;
			}
			iSum = iSum + iPower;
			iPower = 1;
			temp = temp / 10;
		}
		if(iSum == iNo)
		{
			return true;
		}
		else
		{
			return false;
		}
		*/
	

}

class Program199
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
			
		System.out.print("Enter number : ");
		int iNo = sobj.nextInt();

		Digits dobj = new Digits();


		boolean bRet = dobj.Armstrong(iNo);
		if(bRet == true)
		{
			System.out.print(iNo+ " is Armstrong number \n");
		}
		else
		{
			System.out.print(iNo+ " is not Armstrong number \n");
		}
	}
}
