import java.io.*;
import java.lang.*;

public class jikann2
{
	public static void main(String[] args)
	{
		
		int x;
		int y;
		
		try
		{
			BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
			
			//x“ü—Í
			x = Integer.parseInt(d.readLine());
			
			y = x*60;
			
			System.out.println("y="+ y);
		}
		catch (NumberFormatException nfe)
		{
			System.out.println("”’lˆÈŠO‚ª“ü—Í‚³‚ê‚Ü‚µ‚½B");
		}
		catch (Exception e)
		{
			System.out.println("error");
		}
	}
}