// Accept string from user and count no.of numer of words

import java.util.*;

class StringDemo
{	
	public void EvenWords(String str)
	{	
		
		String temp = str.trim().replaceAll("[ ]{2,}"," "); 
		
		String arr[] = temp.split(" ");

		for(int i =0;i<arr.length;i++)
		{
			if((arr[i].length()%2) == 0)
			{
				System.out.println(arr[i]+"\t");
			}
		}
	

	}
}

class Program221
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
