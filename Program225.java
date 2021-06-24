// Accpet string dispaly reverse string and make it another string

// Inoput : Hello World
// Output : olleH dlroW

import java.util.*;

class StringDemo
{	
	public String ReverseWord(String str)
	{	
		
		String temp = str.trim().replaceAll("[ ]{2,}"," "); 
		
		String arr[] = temp.split(" ");
		String output = " ";
		for(String s : arr)
		{		
				StringBuffer bobj = new StringBuffer(s);
				output = output + " "+bobj.reverse();
				bobj = null;
		}

		return output.trim();
	}
}

class Program225
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter String : ");
		String str = sobj.nextLine();

		StringDemo sdobj = new StringDemo();

		String sRet = sdobj.ReverseWord(str);
		System.out.println("Reversed string is : "+sRet);
		

	}
}
