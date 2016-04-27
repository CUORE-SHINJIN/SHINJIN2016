package D009;

import java.util.*;

public class tes{
	public static void main(String[] args)throws Exception{
		try{
			Scanner scan=new Scanner(System.in);
			int a=scan.nextInt();
			int b=scan.nextInt();
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