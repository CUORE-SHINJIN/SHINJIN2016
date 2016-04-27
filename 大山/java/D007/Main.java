package D007;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
		public static void main(String[] args) throws Exception{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String line=br.readLine();
			try{
				int n=Integer.parseInt(line);
				if(n<=100 && n>=1){
					for(int i=0;i<n;i++){
						System.out.print("*");
					}
					System.out.println();
				}else{
					System.out.println("error");
				}
			}catch(NumberFormatException e){
				System.out.println("error");
			}
		}
	
}