/*
Accept 4 numbers from user , each number should be between 0-255.
 Combine those numbers into one integer which becomes an IP address and later unpack them indiually
*/

import java.util.*;


class IPAddress
{
	public int Packing(int iNo1,int iNo2,int iNo3,int iNo4)
	{	
	
		if((iNo1 < 0) || (iNo2 < 0) || (iNo3 < 0) || (iNo4 < 0))
		{
			iNo1 = -iNo1; iNo2 = -iNo2; iNo3 = -iNo3; iNo4 = -iNo4;
		}
		/*
		int ans = 0;

		int i = iNo1 << 24;
		int j = iNo2 << 16;
		int k = iNo3 << 8;
		int l = iNo4;
		ans = i | j | k | l;
		return ans;
		*/

		return ((iNo1<<24) | (iNo2<<16) | (iNo3<<8) | (iNo4));
	}

	public void Unpacking(int no)
	{
		int no1,no2,no3,no4;

		no4 = no & 0x000000ff;

		no3 = no >> 8;
		no3 = no3 & 0x000000ff;

		no2 = no >> 16;
		no2 = no2 & 0x000000ff;

		no1 = no >> 24;
		//no4 = no & 000000ff;

		
		System.out.println("1st number is : "+no1);
		System.out.println("2nd number is : "+no2);
		System.out.println("3rd number is : "+no3);
		System.out.println("4th number is : "+no4);
	}
}
 class Program206
 {
 	public static void main(String args[])
 	{
 		Scanner sobj = new Scanner(System.in);

 		System.out.print("Enter 1st number between 0-255 : ");
 		int iNo1 = sobj.nextInt();

 		System.out.print("Enter 2nd number between 0-255 : ");
 		int iNo2 = sobj.nextInt();

 		System.out.print("Enter 3rd number between 0-255 : ");
 		int iNo3 = sobj.nextInt();

 		System.out.print("Enter 4th number between 0-255 : ");
 		int iNo4 = sobj.nextInt();

 		IPAddress mobj = new IPAddress();

 		int iRet = mobj.Packing(iNo1,iNo2,iNo3,iNo4);
 		System.out.println("Packed number is : "+iRet);

 		mobj.Unpacking(iRet);

 	}
 }