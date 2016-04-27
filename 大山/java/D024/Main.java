package D024;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		String line2=br2.readLine();
		
		try{
			int a=Integer.parseInt(line);
			int b=Integer.parseInt(line2);
			if(a<=179 && a>=1 && b<=179 && b>=1){
				int c=180-a-b;
				if(c<=179 && c>=2){
					System.out.println(c);
				}else{
					System.out.println("error");
				}
			}
		}catch(NumberFormatException e){
			System.out.println("error");
		}
	}
}