/*
58_3.Write a java program which accept string from user and display such a word 
	which occurs maximum number of times.

Input : India is Demo India Hello Demo India
Output : India
*/
import java.io.*;
import java.util.*;

class Frequency
{
	public void Count(String str)
	{
		String arr[] = new String[100];

		Map<String,Integer> map = new TreeMap<>();

		arr = str.split(" ");
		for(int i =0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i],(map.get(arr[i]))+1);
			}
			else
			{
				map.put(arr[i],1);
			}
		}

		int iMax = 0;
		int iNum = 0;
		for(Map.Entry<String,Integer>entry : map.entrySet())
		{	
			iNum = entry.getValue();
			if(iNum > iMax)
			{
				iMax = iNum;
			}
		}
		for(int i=0;i<map.size();i++)
		{
			if((map.get(arr[i])) == iMax)
			{
				System.out.println(arr[i]);
				//break;
			}
		}
	}
		
}
class Ass58_3
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter string : ");
		String str = sobj.nextLine();

		Frequency fobj = new Frequency();

		fobj.Count(str);

		sobj.close();
	}	
}