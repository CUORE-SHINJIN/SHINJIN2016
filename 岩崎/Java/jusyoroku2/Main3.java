package jusyoroku2;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class Main3 {
	public static void main (String[] args) throws Exception {
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(System.in);
		int i = 0;
				
	/*Memb型の配列変数 me の宣言と、要素数の確保。
		Membクラスはメンバ変数を宣言するクラス*/
		Memb me[] =  new Memb[21];
		
		//実体となったMemb型の配列に、Membクラスをインスタンス化して代入
		for(int n = 0;n < 21;n++){
			me[n] = new Memb();
		}
		
		
	//入力受付のための無限ループをつくる
		while(true){
	//メンバ以外の変数に情報を入力。ここには名前もしくは「:list」「:exit」が入力される
			me[i].n= in.next();
		
	//「:list」「:exit」でなければメンバにデータをコピー
			if(!(me[i].n.equals(":list")) && !(me[i].n.equals(":exit"))){
				me[i].name = me[i].n.substring(0);
			
	
	//名前以下の情報をスペース区切りで入力
			//age2[i] = in.next();
			//age[i] = Integer.parseInt(age2[i]);
			me[i].age = in.nextInt();
			me[i].telno = in.next();
			me[i].address = in.next();
			
			i++;
			}
	//変数 n に入力された文字列が「:list」なら情報の出力
			else if(me[i].n.equals(":list")){
				int s;
				for(s = 0;s < i;s++){
					System.out.println(s+1 + " Name=" + me[s].name + " Age=" + me[s].age + " TelNo=" + me[s].telno + " Address=" + me[s].address);
				}
			}
			
	//変数 n に入力された文字列が「:exit」ならプログラム終了
			else if(me[i].n.equals(":exit")){
				System.exit(0);
			}
	//20回以上ループしたら（情報入力されたら）エラー
			if(i > 20){
				System.err.print("Error");
				System.exit(1);
			}
		}
	}
}
		