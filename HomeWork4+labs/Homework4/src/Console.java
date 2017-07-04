import java.io.IOException;

public class Console {
	public static void main(String[] args)
	{

	}
	public static void printPrompt(String prompt)
	{
		System.out.println(prompt +" ");
	}
	
	public static String readLine()
	{
		int ch;
		String r = " ";
		boolean done = false;
		while(!done)
		{
			try
			{
				ch = System.in.read();
				if((char)ch=='\n')done=true;
				else if(ch!='\r')r=r+(char)ch;
			}
			catch(IOException e)
			{
				done = true;
			}
		}
		return r;
		}
	
	
public static String readLine(String prompt)
{
	printPrompt(prompt);
	return readLine();
}

public static int readInt(String prompt)
{
	while(true)
	{
		printPrompt(prompt);
		try
		{
			return Integer.parseInt(readLine().trim());
		}
		 catch(NumberFormatException e)
		{
			 System.out.println("Не е integer, опитай отново! ");
		}
		
	}
}

public static long readLong(String prompt)
{
	while(true)
	{
		printPrompt(prompt);
		try
		{
			return Long.parseLong(readLine().trim());
		}
		 catch(NumberFormatException e)
		{
			 System.out.println("Не е long, опитай отново! ");
		}
	}
}


public static double readDouble(String prompt)
{
	while(true)
	{
		printPrompt(prompt);
		try
		{
			return Double.parseDouble(readLine().trim());
		}
		 catch(NumberFormatException e)
		{
			 System.out.println("Не е double, опитай отново! ");
		}
		
	}
}

}
