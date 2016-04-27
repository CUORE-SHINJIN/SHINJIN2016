package D032;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		try{
			int n=Integer.parseInt(line);
			if(n<=100 && n>=1){
				int m=100-n;
				System.out.println(m);
			}else{
				System.out.println("error");
			}
		}catch(NumberFormatException e){
			System.out.println("error");
		}
	}
}
				