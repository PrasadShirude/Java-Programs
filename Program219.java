// Accept string from user and count no.of numer of words

import java.util.*;

class StringDemo
{	
	public void WordCount(String str)
	{
		String temp = str.trim(); 
		String arr[] = temp.split("\\s");
		System.out.print("No.of words are  : "+arr.length);

	}
}

class Program219
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter String : ");
		String str = sobj.nextLine();

		StringDemo sdobj = new StringDemo();

		sdobj.WordCount(str);

	}
}
