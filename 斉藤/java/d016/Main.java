package d016;

import java. io. BufferedReader;
import java. io. InputStreamReader;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System. in));
		String a = br. readLine();
		String b = br. readLine();
		int n = a.length();
		int mozisuu = Integer.parseInt(b);
		if(n>=1&&n<=100&&n>=mozisuu){
			String new_a = a.substring(0,mozisuu);
			System. out. println(new_a);
		}else{
			System. out. println("error!");
		}
	}
}