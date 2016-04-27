package d010;

import java. io. BufferedReader;
import java. io. InputStreamReader;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System. in));
		String a = br. readLine();
		String b = br. readLine();
		int x = a.length();
		int y = b.length();
		if(x>=1&&x<=64&&y>=1&&y<=64){
			System. out. println(a + "@" + b);
		}else{
			System. out. println("error!");
		}
	}
}