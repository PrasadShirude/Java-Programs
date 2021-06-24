// Accept string from user and count no.of numer of words

import java.util.*;

class StringDemo
{	
	public void WordCount(String str)
	{
		int iLen = str.length();
		System.out.println("String length is : "+iLen);
		String temp = str.trim(); 
		System.out.println(temp);
		System.out.println("length of new Strin : "+temp.length()); 
		String temp2 = temp.replaceAll("\\s","");
		System.out.println("Modified String : "+temp2); 
	}
}

class Program216
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
