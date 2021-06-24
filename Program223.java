// Accept string from user and dispaly the word with maximum lenth


import java.util.*;

class StringDemo
{	
	public void MaxWords(String str)
	{	
		
		String temp = str.trim().replaceAll("[ ]{2,}"," "); 
		
		String arr[] = temp.split(" ");

		/* Method 1
		String sMax = arr[0];
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i].length() > sMax.length())
			{
				sMax = arr[i];
			}
		}
		System.out.println(sMax);
		*/

		/* Method 2
		String sMax = arr[0];
		for(String s : arr)
		{
			if(s.length() > sMax.length())
			{
				sMax = s;
			}
		}
		System.out.println(sMax);
		*/

		int iMax = Arr[0].length();
		int index = 0;
		// Logic
		for(int i = 0; i < Arr.length; i++)
		{
			if(Arr[i].length() > iMax)
			{
				iMax = Arr[i].length();
				index = i;
			}
		}
		System.out.println("Longest word is : "+Arr[index]);
	}
}

class Program223
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter String : ");
		String str = sobj.nextLine();

		StringDemo sdobj = new StringDemo();

		sdobj.MaxWords(str);
		

	}
}
