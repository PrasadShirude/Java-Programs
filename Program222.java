// Accept string from user and count no.of numer of words

import java.util.*;

class StringDemo
{	
	public void EvenWords(String str)
	{	
		
		String temp = str.trim().replaceAll("[ ]{2,}"," "); 
		
		String arr[] = temp.split(" ");

		for(String s : arr)
		{
			if((s.length()%2) == 0)
			{
				System.out.println(s);
			}
		}
	

	}
}

class Program222
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter String : ");
		String str = sobj.nextLine();

		StringDemo sdobj = new StringDemo();

		sdobj.EvenWords(str);
		

	}
}
