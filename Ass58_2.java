/*
58_2.Write a java program which accept string from user and print frequency of each word.

Input : India is Demo India Hello Demo
Output : India	 2
		 is		 1
		 Demo	 2
		 Hello	 1
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

		for(Map.Entry<String,Integer>entry : map.entrySet())
		{
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
	}
}
class Ass58_2
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