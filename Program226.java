// HashMap/ HashTable

import java.util.*;

class MyHashMap
{
	public void CharacterFrequency(String str)
	{
		char Arr[] = str.toCharArray();

		HashMap <Character,Integer> ht = new HashMap<Character,Integer>();

		for(char ch : Arr)
		{
			if(ht.containsKey(ch))
			{
				ht.put(ch,ht.get(ch)+1);
			}
			else
			{
				ht.put(ch,1);
			}
		}
		System.out.println(ht);
	}

	public void WordFrequency(String str)
	{
		String temp = str.trim().replaceAll("[ ]{2,}"," ");

		String Arr[] = temp.split(" ");

		HashMap <String,Integer> ht = new HashMap<String,Integer>();

		for(String s : Arr)
		{
			if(ht.containsKey(s))
			{
				ht.put(s,ht.get(s)+1);
			}
			else
			{
				ht.put(s,1);
			}
		}
		System.out.println(ht);
	}
}

class Program226
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter String : ");
		String str = sobj.nextLine();

		MyHashMap hobj = new MyHashMap();

		hobj.CharacterFrequency(str);
		hobj.WordFrequency(str);
	}
}