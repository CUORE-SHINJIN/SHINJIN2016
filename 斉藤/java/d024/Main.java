package d024;

import java. io. BufferedReader;
import java. io. InputStreamReader;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System. in));
		String a = br. readLine();
		String b = br. readLine();
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		int d = 180-(x+y);
		if(x>=1&&x<=179&&y>=1&&y<=179&&d>=2&&d<=179){
			System. out. println(d);
		}else{
			System. out. println("error!");
		}
	}
}