// Accpet string dispaly reverse string 

import java.util.*;

class StringDemo
{	
	public void ReverseWord(String str)
	{	
		
		String temp = str.trim().replaceAll("[ ]{2,}"," "); 
		
		String arr[] = temp.split(" ");

		for(String s : arr)
		{		
				StringBuffer bobj = new StringBuffer(s);
				System.out.println(bobj.reverse());
				bobj = null;
		}
	}
}

class Program224
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter String : ");
		String str = sobj.nextLine();

		StringDemo sdobj = new StringDemo();

		sdobj.ReverseWord(str);
		

	}
}
