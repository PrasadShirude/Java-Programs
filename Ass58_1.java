/*
1.Write a java program which accept two strings from user and 
	check whether first string is the of rotation of second string or not.

Input : abcdefg cdefgab
Output : True
*/

import java.io.*;
import java.util.*;


class Rotation 
{
	//public String str1,str2;

	public boolean rotate(String str1, String str2)
	{	
		String str3 = str1+str2;
		//System.out.println(str3+"\n");
		StringBuffer str = new StringBuffer(str3);
		String string = str.toString();
		if(string.contains(str1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
class Ass58_1
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter first string : ");
		String str1 = sobj.nextLine();

		System.out.println("Enter second string : ");
		String str2 = sobj.nextLine();

		Rotation robj = new Rotation();

		boolean bRet = robj.rotate(str1,str2);

		if(bRet == true)
		{
			System.out.println("Is Rotation \n ");
		}
		else
		{
			System.out.println("Is not Rotation\n");
		}

	}
}