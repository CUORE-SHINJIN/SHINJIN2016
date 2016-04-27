package jusyoroku;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main2 {
	public static void main (String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(System.in);
				
		int i = 0;
		String n[] = new String[21];
		String name[] = new String[21];
		int age[] = new int[21];
		String age2[] = new String[21];
		String telno[] = new String[21];
		String address[] = new String[21];
		
		
		/*無限ループをつくる*/
		while(true){
		/*メンバ以外の変数に名前を入力*/
			n[i] = in.next();
		
		/*「:list」「:exit」でなければメンバにデータをコピー*/
			if(!(n[i].equals(":list")) && !(n[i].equals(":exit"))){
				name[i] = n[i].substring(0);
			
	
		/*名前以下の情報をスペース区切りで入力*/
			age2[i] = in.next();
			age[i] = Integer.parseInt(age2[i]);
			telno[i] = in.next();
			address[i] = in.next();
			
			i++;
			}
		/*「:list」なら情報の出力*/
			else if(n[i].equals(":list")){
				int s;
				for(s = 0;s < i;s++){
					System.out.println(s+1 + " Name=" + name[s] + " Age=" + age[s] + " TelNo=" + telno[s] + " Address=" + address[s]);
				}
			}
			
		/*「:exit」ならプログラム終了*/
			else if(n[i].equals(":exit")){
				System.exit(0);
			}
		/*20回以上ループしたら（情報入力されたら）エラー*/
			if(i > 20){
				System.out.print("Error");
				System.exit(1);
			}
		}
	}
}
		