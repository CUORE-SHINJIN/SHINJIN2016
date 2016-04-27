package d031;

import java. io. BufferedReader;
import java. io. InputStreamReader;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System. in));
		String line = br. readLine();
		int n = Integer.parseInt(line);
		if(n>=1&&n<=100){
			int d = n*60;
			System. out. println(d);
		}else{
			System. out. println("error!");
		}
	}
}