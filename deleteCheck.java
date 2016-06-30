package Database;

import java.util.ArrayList;

public class deleteCheck
{
	private static ArrayList <String> list = new ArrayList<>();
	
	public static void addchangedUser(String name)
	{
		list.add(name);
	}
	
	public static boolean getDeletedName(String name)
	{
		boolean ans = true;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).equalsIgnoreCase(name))
			{
				ans = false;
			}
		}
		
		return ans;
	}
}
