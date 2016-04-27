package D010;

import java.io.*;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		String line2=br2.readLine();
		int n=line.length();
		int n2=line2.length();
		if(n>=1 && n<=64 && n2>=1 && n2<=64){
			System.out.println(line+"@"+line2);
		}else{
			System.out.println("error");
		}
	}
}
