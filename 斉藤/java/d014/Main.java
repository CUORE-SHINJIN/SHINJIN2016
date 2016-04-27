package d014;

import java. io. BufferedReader;
import java. io. InputStreamReader;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System. in));
		String a = br. readLine();
		int n = a.length();
		if(n>=1&&n<=100){
			String upper_a = a.toUpperCase();
			System. out. println(upper_a);
		}else{
			System. out. println("error!");
		}
	}
}