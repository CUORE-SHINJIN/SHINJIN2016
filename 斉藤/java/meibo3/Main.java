//パッケージ名
package meibo3;
//標準入出力に使用
import java. io. BufferedReader;
import java. io. InputStreamReader;

//入出力などを行うメインクラス
public class Main {
	public static void main(String args[]) throws Exception {
		//キーボードからの入力を可能にするための実行文
		BufferedReader br = new BufferedReader(new InputStreamReader(System. in));
		//Statusクラスを使った配列の宣言文(枠数20)
		Status[] member =new Status[20];
		//配列20枠分の実行文
		int i =0;
		for(i=0;i<20;i++){
			member[i] = new Status();
		}
		//
		int n=0;
		//無限ループで入力受付
		for(;;){
			//入力された一行分の読み込み
			String input =br. readLine();
			//入力された頭文字が「：」でないか判断(「：～」をコマンドとして使用するため)
			if(!input.startsWith(":")){
				//入力された一行をスペースの部分で4つに分割
				String[] meibo =input.split(" ",4);
				//分割した4項目をそれぞれ名前、年齢、電話番号、住所の配列の箱に入れる
				member[n].name = meibo[0];
				//年齢は数字なのでint型に変換
				member[n].age = Integer.parseInt(meibo[1]);
				member[n].tel = meibo[2];
				member[n].ado = meibo[3];
				//次の配列の箱へ移動
				n++;
			//入力された頭文字が「：」(コマンドを入力された)場合の実行内容
			}else{
				//「:list」が入力された時の実行内容
				if(input.equals(":list")){
					//入力された分までの配列を入力順に表示
					for(i=0; i<n; i++){
						//ナンバリングを加え、スペース空けてそれぞれの項目を出力
						System.out.println(
						(i+1) +" "+ member[i].name +" "+ 
						member[i].age +" "+ 
						member[i].tel +" "+member[i].ado);
					}
				//「:exit」が入力された時の実行内容
				}else if(input.equals(":exit")){
					//システム終了
					System.exit(0);
				}
			}
		}
	}
}