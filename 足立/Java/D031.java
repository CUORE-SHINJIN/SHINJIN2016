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
			
			//x����
			x = Integer.parseInt(d.readLine());
			
			y = x*60;
			
			System.out.println("y="+ y);
		}
		catch (NumberFormatException nfe)
		{
			System.out.println("���l�ȊO�����͂���܂����B");
		}
		catch (Exception e)
		{
			System.out.println("error");
		}
	}
}