package d035;

import java. util.Scanner;

public class Main {
	public static void main (String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int y = scan.nextInt();
		int m = scan.nextInt();
		int d = scan.nextInt();

		if(y>=2000&&y<=2016&&m>=1&&m<=12&&d>=1&&d<=31){
			System. out. println(y + "/" + m + "/" + d);
		}else{
			System. out. println("error!");
		}
	}
}