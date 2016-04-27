package d026;

import java. io. BufferedReader;
import java. io. InputStreamReader;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System. in));
		int i;
		int count = 0;
		for(i = 0; i <= 7; i++){
			String line = br. readLine();
			if(line.equals("yes")){
				continue;
			}else if(line.equals("no")){
				count++;
			}else{
				System. out. println("error!");
				return;
			}
		}
			System. out. println(count);
	}
}