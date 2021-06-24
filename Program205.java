/*
	Accept two string and check if they are anagram or not

	care = race
	abcd = cdab
	hello = elolh
*/

import java.util.*;

class StringDemo
{
		public boolean ChkAnagram(String str1,String str2)
		{	
			char crr1[] = str1.toCharArray();
			char crr2[] = str2.toCharArray();

			if(str1.length() != str2.length())
			{
				return false;
			}


			for(int i = 0;i<str1.length();i++)
			{
				if(crr1[i] >= 'A' && (crr1[i]) <= 'Z')
				{
					return false;
				}
			}

			for(int i = 0;i<str2.length();i++)
			{
				if(crr2[i] >= 'A' && (crr2[i]) <= 'Z')
				{
					return false;
				}
			}
			
			int i = 0;
			int count[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
			
			
			

			for(i = 0;i<str1.length();i++)
			{
				count1[crr1[i] - 'a']++;
				count2[crr2[i] - 'a']--;
			}

			for(i=0;i<26;i++)
			{
				if(count[i] != 0)
				{
					break;
				}
			}
			if(i == 26)
			{
				return true;
			}
			else
			{
				return false;
			}

		}
}

class Program205
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter string 1 : ");
		String str1 = sobj.nextLine();

		System.out.print("Enter string 2 : ");
		String str2 = sobj.nextLine();

		StringDemo sd = new StringDemo();
		
		boolean bRet = sd.ChkAnagram(str1,str2);
		if(bRet == true)
		{
			System.out.println("String is anagram");
		}
		else
		{
			System.out.println("String i9s not anagram");
		}


	}
}