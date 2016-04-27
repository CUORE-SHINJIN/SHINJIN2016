package d009;

import java. io. BufferedReader;
import java. io. InputStreamReader;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System. in));
		String a = br. readLine();
		String b = br. readLine();
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		if(x>=1&&y<=2014&&x<y){
			int d = y-x;
			System. out. println(d);
		}else{
			System. out. println("error!");
		}
	}
}