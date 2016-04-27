package d007;

import java. io. BufferedReader;
import java. io. InputStreamReader;

public class Main {
	public static void main (String[] args) throws Exception {
		int i = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System. in));
		String line = br. readLine();
		int n = Integer.parseInt(line);
		if(n>=1&&n<=100){
			for(; i < n;){
				System. out. print("*");
				i++;
			}
		}else{
			System. out. print("error!");
		}
	}
}