/*
58_5.Write a java program which accept expression from user. Check whether the expression 
	is balanced parenthesised or not. (Expression should contains only circular brackets.)

Input : (a+(f-g)*2(a-d))
Output : True

Input : (a+(f-g)*2(a-d)
Output : False
*/

import java.util.*;
import java.io.*;

class Balanced
{
	public boolean Check(String str)
	{
		Stack <Character> s = new Stack();

		char arr[] = str.toCharArray();

		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] == '(' || arr[i] == '[' || arr[i] == '{')
			{	
				s.push(arr[i]);
			}

			if(arr[i] == ')' || arr[i] == ']' || arr[i] == '}')
			{
				if(s.empty())
					return false;

				Character x = s.pop();

				if((arr[i] == '(' && x != ')') || (arr[i] == '[' && x != ']') || (arr[i] == '{' && x != '}'))
					return false;
			}
		}	
		return (s.empty());
	}
} 
class Ass58_5
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter string : ");
		String str = sobj.nextLine();

		Balanced bobj = new Balanced();

	    boolean bRet = bobj.Check(str);
	    if(bRet == false)
	    {
	    	System.out.println("The given equation is not Balanced");
	    }
	    else
	    {
	    	System.out.println("The given equation is Balanced");	
	    }
	}
}