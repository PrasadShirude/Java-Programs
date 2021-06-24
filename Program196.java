import java.io.*;
import java.util.*;

class Maths
{
	 int Addition(int x,int y)
	{
		return x+y;
	}
}

class Program196
{	
	
	public static void main(String args[])
	{	

		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter no1 : ");
		int iNo1 = sobj.nextInt();

		System.out.print("Enter no1 : ");
		int iNo2 = sobj.nextInt();

		Maths mobj = new Maths();

		int ans = mobj.Addition(iNo1,iNo2);

		System.out.print("Addition is : "+ans);	
	}
}