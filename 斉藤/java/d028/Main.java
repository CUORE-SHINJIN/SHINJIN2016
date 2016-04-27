package d028;

import java. io. BufferedReader;
import java. io. InputStreamReader;

public class Main {
	public static void main (String[] args) throws Exception {
		int i = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System. in));
		String line = br. readLine();
		int n = Integer.parseInt(line);
		if(n>=1&&n<=10000){
			while(n != 0){
				n=n/10;
				++i;
			}
		}else{
			System. out. print("error!");
		}
		System. out. print(i);
	}
}