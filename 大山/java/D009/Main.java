package D009;

import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
		try{
			BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
			String ab=input.readLine();
			StringTokenizer a_b=new StringTokenizer(ab," ");
			int a=Integer.parseInt(a_b.nextToken());
			int b=Integer.parseInt(a_b.nextToken());
			if(a>=1 && b<=2014 && a<b){
				System.out.println(b-a);
			}else{
				System.out.println("error");
			}
		}catch(Exception e){
			System.out.println("error");
		}
	}
}