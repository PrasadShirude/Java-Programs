// Accept string from user and count no.of numer of words

import java.util.*;

class StringDemo
{	
	public int WordCount(String str)
	{	
		System.out.println("String length is : "+str.length());
		String temp = str.trim().replaceAll("[ ]{2,}"," "); 
		System.out.println("New String after removing whitespace  : "+temp.length());
		System.out.println("Modified String is : "+temp);
		String arr[] = temp.split(" ");

		for(int i =0;i<arr.length;i++)
		{
			if((arr[i].length()%2) == 0)
			{
				System.out.println(arr[i]+"\t");
			}
		}
		return arr.length;

	}
}

class Program220
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter String : ");
		String str = sobj.nextLine();

		StringDemo sdobj = new StringDemo();

		int iRet = sdobj.WordCount(str);
		System.out.println("Word Count is : "+iRet);

	}
}
